package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        /* Podemos também fazer o conceito de programação defensiva, que faz a validação de uma exceção já no início dos métodos */
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    /* Para podermos tratar essa exceção no programa principal, sem que o compilador nos obriga a tratá-la com o try/catch aqui
    * no construtor, é fundamental que adicionamos o "throws (nome da exceção personalizada que criamos)", isso chama-se propagar a
    * exceção */
    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
             throw new DomainException("Reservation dates for update must be futures dates");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber +
                ", check-in: " + sdf.format(checkIn) +
                ", check-out: " + sdf.format(checkOut) +
                ", " + duration() + " nights";
    }
}

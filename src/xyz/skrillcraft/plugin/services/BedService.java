package xyz.skrillcraft.plugin.services;

public class BedService {
    private int playersInBed = 0;

    public void addPlayerToBed() {
        playersInBed++;
    }

    public int getPlayersInBed() {
        return playersInBed;
    }

    public void removePlayerFromBed() {
        playersInBed--;
    }
}

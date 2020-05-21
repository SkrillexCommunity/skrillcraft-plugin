package xyz.skrillcraft.plugin.managers;

public class BedManager {
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

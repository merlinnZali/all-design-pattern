package org.ttm.behavior.state;

public class StateP {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.clickStart();
        PlayingState state = new PlayingState(player);
        player.changeState(state);
        player.clickPlay();
    }

}

class AudioPlayer {
    private State state;

    public AudioPlayer() {
        this.state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    void clickStart() {
        this.state.clickStart();
    }

    void clickLock() {
        this.state.clickLock();
    }


    void clickPlay() {
        this.state.clickPlay();
    }


    void clickNext() {
        this.state.clickPlay();
    }


    void clickPrevious() {
        this.state.clickPlay();
    }
}

abstract class State{
    private AudioPlayer player;

    public State() {
    }
    public State(AudioPlayer player) {
        this.player = player;
    }

    public void setPlayer(AudioPlayer player) {
        this.player = player;
    }

    abstract void clickStart();

    abstract void clickLock();
    abstract void clickPlay();
    abstract void clickNext();
    abstract void clickPrevious();
}

class PlayingState extends State {

    public PlayingState() {
    }

    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickStart() {

    }

    @Override
    void clickLock() {

    }

    @Override
    void clickPlay() {

    }

    @Override
    void clickNext() {

    }

    @Override
    void clickPrevious() {

    }
}

class ReadyState extends State {

    public ReadyState() {
    }

    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickStart() {

    }

    @Override
    void clickLock() {

    }

    @Override
    void clickPlay() {

    }

    @Override
    void clickNext() {

    }

    @Override
    void clickPrevious() {

    }
}
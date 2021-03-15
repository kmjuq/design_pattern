package behave.observe.simple;

public class MeetingTest {

    public static void main(String[] args) {
        MorningMeeting morningMeeting = new MorningMeeting();
        morningMeeting.addParticipant(new Kmj()).addParticipant(new Lj()).addParticipant(new Wyq());
        morningMeeting.setUpMeeting("game");
    }

}

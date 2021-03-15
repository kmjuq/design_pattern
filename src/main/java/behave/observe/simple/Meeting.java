package behave.observe.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public abstract class Meeting {

    private final List<Participant> participants = new ArrayList<>();

    public Meeting addParticipant(Participant participant) {
        participants.add(participant);
        return this;
    }

    public Meeting removeParticipants(Participant participant) {
        participants.remove(participant);
        return this;
    }

    /**
     * 通知所有参会人
     * @param subject 会议主题
     * @return 同意会议请求的参会人
     */
    private List<Participant> notifyParticipant(String subject){
        return participants.stream().filter(participant -> participant.action(subject)).collect(Collectors.toList());
    }

    abstract void prepare();
    
    public void setUpMeeting(String subject){
        prepare();
        log.info(notifyParticipant(subject).toString());
    }

}

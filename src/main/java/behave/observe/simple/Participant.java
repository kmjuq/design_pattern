package behave.observe.simple;

/**
 * 参会人
 */
public interface Participant  {

    /**
     * @param subject 会议主题
     * @return 是否参数会议 true 是 false 否
     */
    boolean action(String subject);

}

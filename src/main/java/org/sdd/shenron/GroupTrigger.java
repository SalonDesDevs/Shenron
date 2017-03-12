package org.sdd.shenron;

import java.util.List;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class GroupTrigger
{
    private String messageId;
    private List<ImmutablePair<String, String>> groups;

    public GroupTrigger(String messageId, List<ImmutablePair<String, String>> groups)
    {
        this.messageId = messageId;
        this.groups = groups;

        // /group trigger "__Systèmes__ : Windows, Mac OS X, Linux" Windows/windows MacOS/osx Linux/linux
        // /group trigger "__Langages Web__ : HTML/CSS, Javascript, PHP" : HTML#CSS
    }

    public String getMessageId()
    {
        return messageId;
    }

    public List<ImmutablePair<String, String>> getGroups()
    {
        return groups;
    }
}

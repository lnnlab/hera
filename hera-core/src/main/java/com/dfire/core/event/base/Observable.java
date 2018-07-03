package com.dfire.core.event.base;

import com.dfire.core.event.listenter.Listener;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午2:32 2018/4/23
 * @desc
 */
public interface Observable {

    void addListener(EventType eventType, Listener<? extends AbstractEvent> listener);

    List<Listener<? extends AbstractEvent>> getListeners(EventType eventType);

    boolean hasListeners();

    boolean hasListeners(EventType eventType);

    void removeAllListeners();


    boolean fireEvent(EventType eventType, AbstractEvent abstractEvent);


}

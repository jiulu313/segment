package com.segment.lib.util;

/**
 * Created by zhanghongjun on 2018/3/15.
 */

public class ConnectionsManager {
    private static ConnectionsManager instance;

    private int lastClassGuid = 1;

    public static ConnectionsManager getInstance(){
        if(instance == null){
            synchronized (ConnectionsManager.class){
                if(instance == null){
                    instance = new ConnectionsManager();
                }
            }
        }

        return instance;
    }

    public int generateClassGuid() {
        return lastClassGuid++;
    }

    public static void cancelRequestsForGuid(int classGuid){
        //todo 之后再研究telegram是怎么实现的
    }

}

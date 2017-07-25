package mimi.michat.app;


import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.Message;
import mimi.michat.app.base.BaseApp;


/**
 * Created by xiangtiangu on 7/24/17.
 * @描述 BaseApp的拓展，用于设置其他第三方的初始化
 */

public class MyApp extends BaseApp implements RongIMClient.OnReceiveMessageListener{
    @Override
    public boolean onReceived(Message message, int i) {
        return true;
    }
}

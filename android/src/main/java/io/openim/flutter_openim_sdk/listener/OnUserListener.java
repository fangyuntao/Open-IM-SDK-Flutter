package io.openim.flutter_openim_sdk.listener;

import io.openim.flutter_openim_sdk.util.CommonUtil;

public class OnUserListener implements open_im_sdk_callback.OnUserListener {

    @Override
    public void onSelfInfoUpdated(String s) {
        CommonUtil.emitEvent("userListener", "onSelfInfoUpdated", s);
    }

    @Override
    public void onUserStatusChanged(String s) {
        CommonUtil.emitEvent("userListener", "onUserStatusChanged", s);
    }

    @Override
    public void onUserCommandAdd(String s) {
        CommonUtil.emitEvent("userListener", "onUserCommandAdd", s);
    }

    @Override
    public void onUserCommandDelete(String s) {
        CommonUtil.emitEvent("userListener", "onUserCommandDelete", s);
    }

    @Override
    public void onUserCommandUpdate(String s) {
        CommonUtil.emitEvent("userListener", "onUserCommandUpdate", s);
    }
}

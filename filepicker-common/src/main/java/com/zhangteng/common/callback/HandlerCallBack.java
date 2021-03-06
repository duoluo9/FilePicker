package com.zhangteng.common.callback;

import android.util.Log;

import com.zhangteng.searchfilelibrary.entity.MediaEntity;

import java.util.List;

/**
 * Created by swing on 2018/4/18.
 */
public class HandlerCallBack implements IHandlerCallBack {
    private String TAG = "---ImagePicker---";

    @Override
    public void onStart() {
        Log.i(TAG, "onStart: 开启");
    }

    @Override
    public void onSuccess(List<MediaEntity> audioList) {
        Log.i(TAG, "onSuccess: 返回数据");
    }

    @Override
    public void onCancel() {
        Log.i(TAG, "onCancel: 取消");
    }

    @Override
    public void onFinish(List<MediaEntity> selectAudio) {
        Log.i(TAG, "onFinish: 结束");
    }

    @Override
    public void onError() {
        Log.i(TAG, "onError: 出错");
    }

    @Override
    public void onPreview(List<MediaEntity> selectAudio) {
        Log.i(TAG, "onPreview: 预览");
    }
}

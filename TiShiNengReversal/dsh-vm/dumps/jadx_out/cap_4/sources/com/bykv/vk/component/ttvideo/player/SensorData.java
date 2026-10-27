package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SensorData {
    protected static final int Sensor_ACC_Data = 1;
    protected static final int Sensor_MAG_Data = 2;
    protected static final int Sensor_ROT_Data = 3;
    private float[] accel;
    private long mHandle;
    private android.hardware.SensorEventListener mListener;
    private android.hardware.SensorManager mSensorManager;
    private float[] magnet;

    public SensorData() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mHandle = r0
            r0 = 0
            r2.mSensorManager = r0
            r2.mListener = r0
            r0 = 3
            float[] r1 = new float[r0]
            r2.magnet = r1
            float[] r0 = new float[r0]
            r2.accel = r0
            return
    }

    private static final native void _writeData(long r0, int r2, float r3, float r4, float r5);

    protected void finalize() {
            r0 = this;
            r0.stop()
            return
    }

    public java.lang.Boolean initListeners() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setHandle(long r1, com.bykv.vk.component.ttvideo.player.TTPlayer r3) {
            r0 = this;
            r0.mHandle = r1
            r3.getContext()
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int start() {
            r1 = this;
            java.lang.Boolean r0 = r1.initListeners()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = -1
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void stop() {
            r2 = this;
            java.lang.String r0 = "ttmn"
            java.lang.String r1 = "stop sensor"
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            r0 = 0
            r2.mHandle = r0
            return
    }
}

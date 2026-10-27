package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
interface CameraDevice {
    boolean autoFocus();

    void close();

    int getBufferCapacity();

    int getCameraOrientation();

    cn.easyar.CameraParameters getCameraParameters();

    int getFrameRateRange();

    int getIndex();

    int getNumSupportedFrameRateRange();

    int getNumSupportedSize();

    int getSizeHeight();

    int getSizeWidth();

    float getSupportedFrameRateRangeLower(int r1);

    float getSupportedFrameRateRangeUpper(int r1);

    int getSupportedSizeHeight(int r1);

    int getSupportedSizeWidth(int r1);

    int getType();

    boolean openWithIndex(int r1);

    boolean openWithSpecificType(int r1);

    void setBufferCapacity(int r1);

    void setCameraParameters(cn.easyar.CameraParameters r1);

    boolean setFlashTorchMode(boolean r1);

    boolean setFocusMode(int r1);

    boolean setFrameRateRange(int r1);

    boolean setSize(int r1, int r2);

    boolean start();

    void stop();
}

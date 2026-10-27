package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ITTPlayerRef {
    public ITTPlayerRef() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.bykv.vk.component.ttvideo.player.ITTPlayerRef create(android.content.Context r6, com.bykv.vk.component.ttvideo.player.TTPlayerClient r7, java.util.HashMap<java.lang.Integer, java.lang.Integer> r8) {
            r0 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Class<com.bykv.vk.component.ttvideo.player.ITTPlayerRef> r2 = com.bykv.vk.component.ttvideo.player.ITTPlayerRef.class
            monitor-enter(r2)
            int r3 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.getCpuFamily()     // Catch: java.lang.Throwable -> L23
            r4 = 1
            if (r3 != r4) goto L25
            com.bykv.vk.component.ttvideo.player.TTPlayerRef r6 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.create(r7, r6)     // Catch: java.lang.Throwable -> L23
            if (r6 == 0) goto L26
            boolean r7 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.isPrintInfo()     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto L26
            java.lang.String r7 = "ttplayer"
            java.lang.String r3 = "---------->ttplayer on<------------"
            com.bytedance.sdk.component.utils.vl.j(r7, r3)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r6 = move-exception
            goto L82
        L25:
            r6 = 0
        L26:
            if (r6 != 0) goto L80
            java.lang.String r7 = "ttplayer"
            java.lang.String r3 = "not find start service info."
            r5 = 16
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r5, r3)     // Catch: java.lang.Throwable -> L23
            com.bytedance.sdk.component.utils.vl.j(r7, r3)     // Catch: java.lang.Throwable -> L23
            r7 = 3
            r3 = 10
            if (r8 == 0) goto L70
            r5 = 100
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r5 = r8.get(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L23
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L23
            if (r5 != r4) goto L70
            java.lang.Object r0 = r8.get(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L23
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L23
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L23
            if (r0 >= r7) goto L80
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            r8.put(r1, r7)     // Catch: java.lang.Throwable -> L23
            goto L80
        L70:
            r8 = 0
            boolean r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r0, r8)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L80
            int r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r8)     // Catch: java.lang.Throwable -> L23
            if (r8 >= r7) goto L80
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r4)     // Catch: java.lang.Throwable -> L23
        L80:
            monitor-exit(r2)
            return r6
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    protected abstract void close();

    protected abstract android.content.Context getContext();

    protected abstract double getDoubleOption(int r1, double r2);

    protected abstract float getFloatOption(int r1, float r2);

    protected abstract int getIntOption(int r1, int r2);

    protected abstract int getLifeId();

    protected abstract long getLongOption(int r1, long r2);

    protected abstract java.lang.Object getObjectOption(int r1);

    protected abstract java.lang.String getStringOption(int r1);

    protected abstract int getType();

    protected void invalid() {
            r0 = this;
            return
    }

    protected abstract boolean isValid();

    protected abstract void mouseEvent(int r1, int r2, int r3);

    protected abstract void pause();

    protected abstract void prepare();

    protected abstract void prevClose();

    protected abstract void release();

    protected abstract void reset();

    protected abstract void rotateCamera(float r1, float r2);

    protected abstract void seekTo(int r1);

    protected abstract void setAudioProcessor(com.bykv.vk.component.ttvideo.player.AudioProcessor r1);

    protected abstract void setCacheFile(java.lang.String r1, int r2);

    protected abstract void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r1);

    protected abstract void setDataSource(java.lang.String r1);

    protected abstract void setDataSourceFd(int r1);

    protected abstract int setDoubleOption(int r1, double r2);

    protected abstract int setFloatOption(int r1, float r2);

    protected abstract void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r1);

    protected abstract int setIntOption(int r1, int r2);

    protected abstract void setLoadControl(com.bykv.vk.component.ttvideo.player.LoadControl r1);

    protected abstract int setLongOption(int r1, long r2);

    protected abstract void setLooping(int r1);

    protected abstract void setMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r1);

    protected abstract void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r1);

    protected abstract void setNotifyState(long r1);

    protected abstract void setOnScreenshotListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r1);

    protected abstract int setStringOption(int r1, java.lang.String r2);

    protected abstract void setSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r1);

    protected abstract void setSurface(android.view.Surface r1);

    protected abstract void setVolume(float r1, float r2);

    protected abstract void start();

    protected abstract void stop();

    protected abstract void switchStream(int r1, int r2);

    protected abstract void takeScreenshot();
}

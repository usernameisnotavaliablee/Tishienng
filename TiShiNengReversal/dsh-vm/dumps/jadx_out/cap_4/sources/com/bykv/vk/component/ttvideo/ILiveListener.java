package com.bykv.vk.component.ttvideo;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveListener {

    @com.bykv.vk.component.ttvideo.player.Keep
    public static class Stub implements com.bykv.vk.component.ttvideo.ILiveListener {
        public Stub() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onAbrSwitch(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onAudioRenderStall(int r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onCacheFileCompletion() {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onCompletion() {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onError(com.bykv.vk.component.ttvideo.log.LiveError r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onFirstFrame(boolean r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onMonitorLog(org.json.JSONObject r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onPrepared() {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onReportALog(int r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onResolutionDegrade(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onSeiUpdate(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onStallEnd() {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onStallStart() {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onVideoRenderStall(int r1) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.ILiveListener
        public void onVideoSizeChanged(int r1, int r2) {
                r0 = this;
                return
        }
    }

    void onAbrSwitch(java.lang.String r1);

    void onAudioRenderStall(int r1);

    void onCacheFileCompletion();

    void onCompletion();

    void onError(com.bykv.vk.component.ttvideo.log.LiveError r1);

    void onFirstFrame(boolean r1);

    void onMonitorLog(org.json.JSONObject r1, java.lang.String r2);

    void onPrepared();

    void onReportALog(int r1, java.lang.String r2);

    void onResolutionDegrade(java.lang.String r1);

    void onSeiUpdate(java.lang.String r1);

    void onStallEnd();

    void onStallStart();

    void onVideoRenderStall(int r1);

    void onVideoSizeChanged(int r1, int r2);
}

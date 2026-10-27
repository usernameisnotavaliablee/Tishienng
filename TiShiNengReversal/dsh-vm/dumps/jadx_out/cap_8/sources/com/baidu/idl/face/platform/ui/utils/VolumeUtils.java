package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VolumeUtils {
    public static final java.lang.String TAG = "VolumeUtils";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VolumeCallback {
        void volumeChanged();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class VolumeReceiver extends android.content.BroadcastReceiver {
        private com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback callback;

        public VolumeReceiver(com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback r1) {
                r0 = this;
                r0.<init>()
                r0.callback = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                java.lang.String r1 = r2.getAction()
                java.lang.String r2 = "android.media.VOLUME_CHANGED_ACTION"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L15
                com.baidu.idl.face.platform.ui.utils.VolumeUtils$VolumeCallback r1 = r0.callback
                if (r1 == 0) goto L15
                java.lang.String r2 = com.baidu.idl.face.platform.ui.utils.VolumeUtils.TAG
                r1.volumeChanged()
            L15:
                return
        }
    }

    static {
            return
    }

    public VolumeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.BroadcastReceiver registerVolumeReceiver(android.content.Context r2, com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback r3) {
            r0 = 0
            com.baidu.idl.face.platform.ui.utils.VolumeUtils$VolumeReceiver r1 = new com.baidu.idl.face.platform.ui.utils.VolumeUtils$VolumeReceiver     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "android.media.VOLUME_CHANGED_ACTION"
            r3.addAction(r0)     // Catch: java.lang.Throwable -> L14
            r2.registerReceiver(r1, r3)     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            r0 = r1
        L15:
            return r0
    }

    public static void unRegisterVolumeReceiver(android.content.Context r0, android.content.BroadcastReceiver r1) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            r0.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }
}

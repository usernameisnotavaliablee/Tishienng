package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyInvocationHandler implements java.lang.reflect.InvocationHandler {
    private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

    public MyInvocationHandler(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mVideoLiveManagerRef = r0
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.Throwable {
            r6 = this;
            java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r7 = r6.mVideoLiveManagerRef
            java.lang.Object r7 = r7.get()
            r0 = r7
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
            r7 = 0
            if (r0 != 0) goto Ld
            return r7
        Ld:
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "updateFrameTerminatedDTS"
            boolean r1 = r1.equals(r2)
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 == 0) goto L3e
            int r1 = r9.length
            if (r1 < r5) goto L3e
            r8 = r9[r4]
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r1 = r8.intValue()
            r8 = r9[r3]
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            r8 = r9[r2]
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r2 = r3
            r4 = r8
            r0.updateFrameTerminatedDTS(r1, r2, r4)
            goto L6a
        L3e:
            java.lang.String r8 = r8.getName()
            java.lang.String r1 = "frameDTSNotify"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6a
            int r8 = r9.length
            if (r8 < r5) goto L6a
            r8 = r9[r4]
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r1 = r8.intValue()
            r8 = r9[r3]
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            r8 = r9[r2]
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r2 = r3
            r4 = r8
            r0.frameDTSNotify(r1, r2, r4)
        L6a:
            return r7
    }
}

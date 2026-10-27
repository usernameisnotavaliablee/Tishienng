package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTSurfaceCallback implements android.view.SurfaceHolder.Callback {
    private static final java.lang.String TAG = "TTSurfaceCallback";
    private com.bykv.vk.component.ttvideo.player.ISurfaceListener mListener;

    static {
            return
    }

    TTSurfaceCallback(com.bykv.vk.component.ttvideo.player.ISurfaceListener r1) {
            r0 = this;
            r0.<init>()
            r0.mListener = r1
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
            r0 = this;
            com.bykv.vk.component.ttvideo.player.ISurfaceListener r2 = r0.mListener
            if (r2 == 0) goto L7
            r2.onSurfaceChanged(r1)
        L7:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.ISurfaceListener r0 = r1.mListener
            if (r0 == 0) goto L7
            r0.onSurfaceCreated(r2)
        L7:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.ISurfaceListener r0 = r1.mListener
            if (r0 == 0) goto L7
            r0.onSurfaceDestroyed(r2)
        L7:
            return
    }
}

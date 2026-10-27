package com.bykv.vk.component.ttvideo.log;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum e extends java.lang.Enum<com.bykv.vk.component.ttvideo.log.e> {
    public static final com.bykv.vk.component.ttvideo.log.e c = null;
    private static final /* synthetic */ com.bykv.vk.component.ttvideo.log.e[] d = null;
    private com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader a;
    private android.content.Context b;

    static {
            com.bykv.vk.component.ttvideo.log.e r0 = new com.bykv.vk.component.ttvideo.log.e
            java.lang.String r1 = "instance"
            r2 = 0
            r0.<init>(r1, r2)
            com.bykv.vk.component.ttvideo.log.e.c = r0
            r1 = 1
            com.bykv.vk.component.ttvideo.log.e[] r1 = new com.bykv.vk.component.ttvideo.log.e[r1]
            r1[r2] = r0
            com.bykv.vk.component.ttvideo.log.e.d = r1
            return
    }

    e(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void a(org.json.JSONObject r7) {
            r6 = this;
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            int r0 = r0 >> 2
            r1 = 1
            r0 = r0 & r1
            java.lang.String r2 = "VideoEventManager"
            if (r0 == r1) goto L11
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> 2
            r0 = r0 & r1
            if (r0 != r1) goto L18
        L11:
            java.lang.String r0 = r7.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r2, r0)
        L18:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto L62
            android.content.Context r0 = r6.b
            if (r0 == 0) goto L2d
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "engine.debug"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)
            goto L2f
        L2d:
            java.lang.String r0 = ""
        L2f:
            if (r0 == 0) goto L62
            java.lang.String r1 = ","
            r3 = -1
            java.lang.String[] r0 = r0.split(r1, r3)
            r1 = 0
        L39:
            int r3 = r0.length
            if (r1 >= r3) goto L62
            r3 = r0[r1]
            java.lang.Object r4 = r7.opt(r3)
            if (r4 == 0) goto L5f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.Object r3 = r7.opt(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r2, r3)
        L5f:
            int r1 = r1 + 1
            goto L39
        L62:
            return
    }

    public static com.bykv.vk.component.ttvideo.log.e valueOf(java.lang.String r1) {
            java.lang.Class<com.bykv.vk.component.ttvideo.log.e> r0 = com.bykv.vk.component.ttvideo.log.e.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bykv.vk.component.ttvideo.log.e r1 = (com.bykv.vk.component.ttvideo.log.e) r1
            return r1
    }

    public static com.bykv.vk.component.ttvideo.log.e[] values() {
            com.bykv.vk.component.ttvideo.log.e[] r0 = com.bykv.vk.component.ttvideo.log.e.d
            java.lang.Object r0 = r0.clone()
            com.bykv.vk.component.ttvideo.log.e[] r0 = (com.bykv.vk.component.ttvideo.log.e[]) r0
            return r0
    }

    public void a(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.b = r1
            return
    }

    public synchronized void a(com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r1) {
            r0 = this;
            monitor-enter(r0)
            r0.a = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    protected void a(boolean r3, org.json.JSONObject r4) {
            r2 = this;
            java.lang.Class<com.bykv.vk.component.ttvideo.log.e> r3 = com.bykv.vk.component.ttvideo.log.e.class
            monitor-enter(r3)
            if (r4 != 0) goto L9
        L5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r4 = move-exception
            goto L16
        L9:
            r2.a(r4)     // Catch: java.lang.Throwable -> L7
            com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r0 = r2.a     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L5
            java.lang.String r1 = "video_playq"
            r0.onEvent(r1, r4)     // Catch: java.lang.Throwable -> L7
            goto L5
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r4
    }
}

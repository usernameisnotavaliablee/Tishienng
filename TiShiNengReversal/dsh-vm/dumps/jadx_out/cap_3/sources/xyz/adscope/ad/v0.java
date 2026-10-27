package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class v0 extends xyz.adscope.ad.t0 {
    private xyz.adscope.ad.v2 f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends android.content.BroadcastReceiver {
        final /* synthetic */ xyz.adscope.ad.v0 a;

        private b(xyz.adscope.ad.v0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.v0 r1, xyz.adscope.ad.v0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
                r3 = this;
                if (r5 == 0) goto L30
                java.lang.String r0 = "prompt"
                java.lang.String r5 = r5.getStringExtra(r0)
                xyz.adscope.ad.v0 r0 = r3.a
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = xyz.adscope.ad.v0.a(r0)
                java.lang.String r1 = "cancel"
                boolean r1 = r1.equals(r5)
                if (r1 == 0) goto L21
                if (r0 == 0) goto L21
                xyz.adscope.ad.v0 r1 = r3.a
                java.lang.String r2 = r0.d()
                r1.a(r2, r4)
            L21:
                java.lang.String r1 = "confirm"
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L30
                if (r0 == 0) goto L30
                xyz.adscope.ad.v0 r5 = r3.a
                xyz.adscope.ad.v0.a(r5, r4, r0)
            L30:
                xyz.adscope.ad.v0 r5 = r3.a
                android.content.Context r4 = r4.getApplicationContext()
                android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
                xyz.adscope.ad.v0.a(r5, r4, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements android.content.ServiceConnection {
        private final android.content.Context a;
        private final xyz.adscope.ad.download.service.a.C0060a b;

        private c(android.content.Context r7, java.lang.String r8, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r9, java.lang.String r10, java.lang.String r11, xyz.adscope.ad.b1 r12) {
                r6 = this;
                r6.<init>()
                android.content.Context r7 = r7.getApplicationContext()
                android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)
                r6.a = r7
                xyz.adscope.ad.download.service.a$a r0 = new xyz.adscope.ad.download.service.a$a
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                r6.b = r0
                return
        }

        /* synthetic */ c(android.content.Context r1, java.lang.String r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3, java.lang.String r4, java.lang.String r5, xyz.adscope.ad.b1 r6, xyz.adscope.ad.v0.a r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private void a(android.os.IBinder r2) {
                r1 = this;
                boolean r0 = r2 instanceof xyz.adscope.ad.download.service.DownloadService.b
                if (r0 == 0) goto L11
                xyz.adscope.ad.download.service.DownloadService$b r2 = (xyz.adscope.ad.download.service.DownloadService.b) r2
                xyz.adscope.ad.download.service.a r2 = r2.a()
                if (r2 == 0) goto L11
                xyz.adscope.ad.download.service.a$a r0 = r1.b
                r2.a(r0)
            L11:
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.a(r2)
                android.content.Context r1 = r0.a
                r1.unbindService(r0)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                return
        }
    }

    public v0() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel a(xyz.adscope.ad.v0 r0) {
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.d()
            return r0
    }

    private void a(android.content.Context r3, xyz.adscope.ad.v0.b r4) {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "com.asnp.ad.ACTION_DOWNLOAD_PROMPT_RESULT"
            r0.addAction(r1)
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r3 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            r3.registerReceiver(r4, r0)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.v0 r0, android.content.Context r1, xyz.adscope.ad.v0.b r2) {
            r0.b(r1, r2)
            return
    }

    private boolean a(int r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.b()
            if (r2 == 0) goto L10
            if (r0 == 0) goto L10
            boolean r2 = r0.o()
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private boolean a(android.content.Context r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r3) {
            r1 = this;
            java.lang.String r0 = r3.e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = r3.e()
            boolean r2 = r1.c(r2, r0)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            java.lang.String r2 = r3.b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2f
            java.lang.String r2 = r3.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r3 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r3.b()
            boolean r2 = r1.a(r2, r3)
            return r2
        L2f:
            r2 = 0
            return r2
    }

    private boolean a(java.lang.String r10, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r11) {
            r9 = this;
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.isValidURL(r10)
            if (r0 == 0) goto L23
            xyz.adscope.ad.v2 r0 = r9.f
            xyz.adscope.ad.b1 r7 = r0.b()
            java.lang.String r6 = r9.e()
            xyz.adscope.ad.v0$c r1 = new xyz.adscope.ad.v0$c
            android.content.Context r2 = r9.e
            java.lang.String r5 = r9.b
            r8 = 0
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            android.content.Context r10 = r9.e
            xyz.adscope.ad.n4.a(r10, r1)
            r10 = 1
            return r10
        L23:
            r10 = 0
            return r10
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.v0 r0, android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r2) {
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r0.b()
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r0.b()
            return r0
        L11:
            r0 = 0
            return r0
    }

    private void b(android.content.Context r1, xyz.adscope.ad.v0.b r2) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r1)
            r1.unregisterReceiver(r2)
            return
    }

    private boolean b(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r2.b()
            if (r0 == 0) goto L25
            xyz.adscope.ad.v0$b r0 = new xyz.adscope.ad.v0$b
            r1 = 0
            r0.<init>(r2, r1)
            r2.a(r3, r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r1 = r2.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1 = r1.b()
            if (r1 == 0) goto L25
            java.lang.String r1 = r1.toJsonString()
            boolean r4 = xyz.adscope.ad.n4.a(r3, r4, r1)
            if (r4 != 0) goto L24
            r2.b(r3, r0)
        L24:
            return r4
        L25:
            r3 = 0
            return r3
    }

    private boolean c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.a(r1, r2)
            return r1
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.c()
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.c()
            return r0
        L11:
            r0 = 0
            return r0
    }

    private java.lang.String e() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r0 = r1.c
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.f()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    private boolean f() {
            r4 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r4.d()
            r1 = 0
            if (r0 == 0) goto L2f
            int r2 = r0.c()
            r3 = 1
            if (r2 != r3) goto L2f
            java.lang.String r2 = r0.e()
            java.lang.String r0 = r0.b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L22
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2f
        L22:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r4.b()
            if (r0 == 0) goto L2f
            boolean r0 = r0.m()
            if (r0 == 0) goto L2f
            return r3
        L2f:
            return r1
    }

    @Override // xyz.adscope.ad.z1
    protected xyz.adscope.ad.x1 a() {
            r1 = this;
            xyz.adscope.ad.v2 r0 = new xyz.adscope.ad.v2
            r0.<init>()
            r1.f = r0
            return r0
    }

    @Override // xyz.adscope.ad.t0
    protected void a(java.lang.String r4, android.content.Context r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L22
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r3.b()
            if (r0 == 0) goto L22
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r3.b()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            boolean r0 = r0.n()
            java.lang.String r2 = "allow"
            r1.putBoolean(r2, r0)
            r0 = 0
            xyz.adscope.ad.n4.a(r5, r4, r0)
        L22:
            return
    }

    @Override // xyz.adscope.ad.t0, xyz.adscope.ad.f2
    protected void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r3, android.view.View r4, int r5) {
            r2 = this;
            if (r3 == 0) goto L4c
            java.lang.String r0 = r3.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = r3.a()
            boolean r0 = r2.a(r0, r1)
            if (r0 == 0) goto L1b
            goto L4c
        L1b:
            boolean r0 = r2.f()
            if (r0 == 0) goto L41
            boolean r5 = r2.a(r5)
            if (r5 == 0) goto L36
            android.content.Context r5 = r4.getContext()
            java.lang.String r0 = r3.b()
            boolean r5 = r2.b(r5, r0)
            if (r5 == 0) goto L41
            goto L4c
        L36:
            android.content.Context r5 = r4.getContext()
            boolean r5 = r2.a(r5, r3)
            if (r5 == 0) goto L41
            goto L4c
        L41:
            java.lang.String r3 = r3.d()
            android.content.Context r4 = r4.getContext()
            r2.a(r3, r4)
        L4c:
            return
    }
}

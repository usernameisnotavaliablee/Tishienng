package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k implements com.ss.android.downloadlib.a.p.InterfaceC0196a {
    private long a;
    public com.ss.android.downloadlib.addownload.o.i b;
    private boolean c;
    private com.ss.android.downloadlib.addownload.l d;
    private com.ss.android.downloadlib.addownload.k.e e;

    class a implements v2.t {
        final /* synthetic */ v2.t a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.k b;

        a(com.ss.android.downloadlib.addownload.k r1, v2.t r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void j() {
                r1 = this;
                v2.t r0 = r1.a
                r0.j()
                return
        }

        public void j(java.lang.String r8) {
                r7 = this;
                v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.addownload.k r1 = r7.b
                com.ss.android.downloadlib.addownload.o$i r1 = r1.b
                com.ss.android.j.j.cw.b r3 = r1.b
                r5 = 0
                r6 = 1
                r1 = 1
                java.lang.String r4 = "您已禁止使用存储权限，请授权后再下载"
                r0.j(r1, r2, r3, r4, r5, r6)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.downloadlib.addownload.k r1 = r7.b
                long r1 = com.ss.android.downloadlib.addownload.k.d(r1)
                r3 = 1
                r0.t(r1, r3)
                v2.t r0 = r7.a
                r0.j(r8)
                return
        }
    }

    class b implements com.ss.android.downloadlib.a.j.InterfaceC0191a {
        final /* synthetic */ v2.t a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.k b;

        b(com.ss.android.downloadlib.addownload.k r1, v2.t r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.a.j.InterfaceC0191a
        public void j() {
                r1 = this;
                v2.t r0 = r1.a
                if (r0 == 0) goto L7
                r0.j()
            L7:
                return
        }

        @Override // com.ss.android.downloadlib.a.j.InterfaceC0191a
        public void j(java.lang.String r2) {
                r1 = this;
                v2.t r0 = r1.a
                if (r0 == 0) goto L7
                r0.j(r2)
            L7:
                return
        }
    }

    class c implements com.ss.android.downloadlib.addownload.k.e {
        final /* synthetic */ com.ss.android.downloadlib.addownload.k a;

        c(com.ss.android.downloadlib.addownload.k r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.k.e
        public void j(com.ss.android.socialbase.downloader.ae.cw r5) {
                r4 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.downloadlib.addownload.k r1 = r4.a
                long r1 = com.ss.android.downloadlib.addownload.k.d(r1)
                r3 = 2
                r0.d(r1, r3, r5)
                return
        }
    }

    static class d extends com.ss.android.socialbase.downloader.r.j {
        private com.ss.android.downloadlib.a.p a;

        d(com.ss.android.downloadlib.a.p r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        private void a(com.ss.android.socialbase.downloader.ae.cw r3, int r4) {
                r2 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 3
                r0.what = r1
                r0.obj = r3
                r0.arg1 = r4
                com.ss.android.downloadlib.a$p r3 = r2.a
                r3.sendMessage(r0)
                return
        }

        public void ae(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = 11
                r1.a(r2, r0)
                return
        }

        public void cw(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = 4
                r1.a(r2, r0)
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = 1
                r1.a(r2, r0)
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2) {
                r0 = this;
                r2 = -1
                r0.a(r1, r2)
                return
        }

        public void m(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = -4
                r1.a(r2, r0)
                return
        }

        public void r(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = -2
                r1.a(r2, r0)
                return
        }

        public void up(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = -3
                r1.a(r2, r0)
                return
        }

        public void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
                r1 = this;
                r0 = 2
                r1.a(r2, r0)
                return
        }
    }

    public interface e {
        void j(com.ss.android.socialbase.downloader.ae.cw r1);
    }

    public k(com.ss.android.downloadlib.addownload.l r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r2
            return
    }

    @androidx.annotation.NonNull
    public static java.util.List<com.ss.android.j.j.cw.f> A(java.util.Map<java.lang.Integer, java.lang.Object> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L5b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Le
            goto L5b
        Le:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof com.ss.android.j.j.cw.f
            if (r2 == 0) goto L2a
            com.ss.android.j.j.cw.f r1 = (com.ss.android.j.j.cw.f) r1
            r0.add(r1)
            goto L16
        L2a:
            boolean r2 = r1 instanceof java.lang.ref.SoftReference
            if (r2 == 0) goto L43
            r2 = r1
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2
            java.lang.Object r3 = r2.get()
            boolean r3 = r3 instanceof com.ss.android.j.j.cw.f
            if (r3 == 0) goto L43
            java.lang.Object r1 = r2.get()
            com.ss.android.j.j.cw.f r1 = (com.ss.android.j.j.cw.f) r1
            r0.add(r1)
            goto L16
        L43:
            boolean r2 = r1 instanceof java.lang.ref.WeakReference
            if (r2 == 0) goto L16
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            boolean r2 = r2 instanceof com.ss.android.j.j.cw.f
            if (r2 == 0) goto L16
            java.lang.Object r1 = r1.get()
            com.ss.android.j.j.cw.f r1 = (com.ss.android.j.j.cw.f) r1
            r0.add(r1)
            goto L16
        L5b:
            return r0
    }

    private void C(v2.t r3) {
            r2 = this;
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = com.ss.android.downloadlib.a.j.f(r0)
            if (r0 == 0) goto Le
            if (r3 == 0) goto L31
            r3.j()
            return
        Le:
            boolean r0 = com.ss.android.downloadlib.a.h.v()
            if (r0 == 0) goto L32
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r0)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "android.permission.READ_MEDIA_AUDIO"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            if (r1 == 0) goto L34
        L2c:
            if (r3 == 0) goto L31
            r3.j()
        L31:
            return
        L32:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
        L34:
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.ss.android.downloadlib.addownload.k$b r1 = new com.ss.android.downloadlib.addownload.k$b
            r1.<init>(r2, r3)
            com.ss.android.downloadlib.a.j.e(r0, r1)
            return
    }

    private boolean b() {
            r1 = this;
            boolean r0 = r1.v()
            if (r0 == 0) goto Le
            boolean r0 = r1.x()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    static /* synthetic */ long d(com.ss.android.downloadlib.addownload.k r2) {
            long r0 = r2.a
            return r0
    }

    private com.ss.android.socialbase.downloader.ae.up e(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "clickid"
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L17
            if (r1 != 0) goto L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L17
            r1.<init>(r3)     // Catch: org.json.JSONException -> L17
            java.lang.String r3 = r1.optString(r0)     // Catch: org.json.JSONException -> L17
            com.ss.android.socialbase.downloader.ae.up r1 = new com.ss.android.socialbase.downloader.ae.up     // Catch: org.json.JSONException -> L17
            r1.<init>(r0, r3)     // Catch: org.json.JSONException -> L17
            return r1
        L17:
            r3 = move-exception
            u2.a r0 = com.ss.android.downloadlib.addownload.m.w()
            java.lang.String r1 = "parseLogExtra Error"
            r0.j(r3, r1)
        L21:
            r3 = 0
            return r3
    }

    private java.lang.String f(com.ss.android.socialbase.downloader.jy.j r9) {
            r8 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r8.b
            com.ss.android.j.j.cw.b r0 = r0.b
            java.lang.String r0 = r0.az()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            com.ss.android.downloadlib.addownload.o$i r9 = r8.b
            com.ss.android.j.j.cw.b r9 = r9.b
            java.lang.String r9 = r9.az()
            return r9
        L17:
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.addownload.o$i r2 = r8.b
            com.ss.android.j.j.cw.b r2 = r2.b
            java.lang.String r2 = r2.j()
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.j(r1, r2)
            boolean r1 = com.ss.android.downloadlib.a.h.v()
            r2 = 1
            if (r1 != 0) goto L39
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            goto L55
        L39:
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            if (r1 != 0) goto L54
            java.lang.String r1 = "android.permission.READ_MEDIA_AUDIO"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            if (r1 != 0) goto L54
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
            boolean r1 = com.ss.android.downloadlib.a.j.f(r1)
            if (r1 == 0) goto L52
            goto L54
        L52:
            r1 = 0
            goto L55
        L54:
            r1 = 1
        L55:
            java.lang.String r3 = r8.z()
            if (r0 == 0) goto L9b
            java.lang.String r4 = r0.qv()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L9b
            java.lang.String r4 = r0.qv()
            if (r1 == 0) goto L6c
            return r4
        L6c:
            java.io.File r5 = android.os.Environment.getDataDirectory()
            java.lang.String r5 = r5.getAbsolutePath()
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L7b
            goto L87
        L7b:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L88
            if (r5 != 0) goto L8c
            boolean r5 = r4.startsWith(r3)     // Catch: java.lang.Exception -> L88
            if (r5 == 0) goto L8c
        L87:
            return r4
        L88:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L8c:
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            int r0 = r0.ae()
            r4.xt(r0)
        L9b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r4 = 2
            java.lang.String r5 = "ttdownloader_code"
            if (r1 == 0) goto La7
            r6 = 1
            goto La8
        La7:
            r6 = 2
        La8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> Lb0
            r0.putOpt(r5, r6)     // Catch: org.json.JSONException -> Lb0
            goto Lb4
        Lb0:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        Lb4:
            com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r6 = "label_external_permission"
            com.ss.android.downloadlib.addownload.o$i r7 = r8.b
            r5.r(r6, r0, r7)
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.b.L()     // Catch: java.lang.Exception -> Lc4
            goto Lc5
        Lc4:
            r0 = 0
        Lc5:
            int r9 = com.ss.android.downloadlib.a.n.i(r9)
            if (r9 == 0) goto Lfe
            r5 = 4
            if (r9 == r5) goto Le1
            if (r1 != 0) goto Ld3
            if (r9 != r4) goto Ld3
            goto Le1
        Ld3:
            r4 = 3
            if (r9 == r4) goto Lda
            if (r1 != 0) goto Lfe
            if (r9 != r2) goto Lfe
        Lda:
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto Lfe
            goto Lff
        Le1:
            android.content.Context r9 = com.ss.android.downloadlib.addownload.m.getContext()
            java.io.File r9 = r9.getFilesDir()
            boolean r1 = r9.exists()
            if (r1 != 0) goto Lf2
            r9.mkdirs()
        Lf2:
            boolean r1 = r9.exists()
            if (r1 == 0) goto Lfe
            java.lang.String r9 = r9.getAbsolutePath()
            r3 = r9
            goto Lff
        Lfe:
            r3 = r0
        Lff:
            return r3
    }

    @androidx.annotation.NonNull
    public static java.util.List<com.ss.android.j.j.cw.e> g(java.util.Map<java.lang.Integer, java.lang.Object> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L5b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Le
            goto L5b
        Le:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof com.ss.android.j.j.cw.e
            if (r2 == 0) goto L2a
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            r0.add(r1)
            goto L16
        L2a:
            boolean r2 = r1 instanceof java.lang.ref.SoftReference
            if (r2 == 0) goto L43
            r2 = r1
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2
            java.lang.Object r3 = r2.get()
            boolean r3 = r3 instanceof com.ss.android.j.j.cw.e
            if (r3 == 0) goto L43
            java.lang.Object r1 = r2.get()
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            r0.add(r1)
            goto L16
        L43:
            boolean r2 = r1 instanceof java.lang.ref.WeakReference
            if (r2 == 0) goto L16
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            boolean r2 = r2 instanceof com.ss.android.j.j.cw.e
            if (r2 == 0) goto L16
            java.lang.Object r1 = r1.get()
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            r0.add(r1)
            goto L16
        L5b:
            return r0
    }

    private boolean t() {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.b r0 = r0.b
            boolean r0 = com.ss.android.downloadlib.a.h.z(r0)
            if (r0 == 0) goto L1a
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.c r0 = r0.d
            int r0 = r0.j()
            boolean r0 = com.ss.android.downloadlib.addownload.d.f(r0)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private boolean u(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            if (r3 == 0) goto L19
            int r0 = r3.i()
            r1 = -3
            if (r0 != r1) goto L19
            java.lang.String r0 = r3.qv()
            java.lang.String r3 = r3.tl()
            boolean r3 = com.ss.android.socialbase.downloader.az.m.r(r0, r3)
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    private boolean v() {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.b r0 = r0.b
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.s()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.b r0 = r0.b
            java.lang.String r0 = r0.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    private boolean x() {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.c r0 = r0.d
            boolean r0 = r0.r()
            return r0
    }

    private boolean y(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r1.b
            com.ss.android.j.j.cw.b r0 = r0.b
            boolean r0 = com.ss.android.downloadlib.a.h.z(r0)
            if (r0 != 0) goto L12
            boolean r2 = r1.u(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public void B(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.downloadlib.addownload.k$e r0 = r1.e
            if (r0 == 0) goto La
            r0.j(r2)
            r2 = 0
            r1.e = r2
        La:
            return
    }

    void a(com.ss.android.socialbase.downloader.ae.cw r5) {
            r4 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r4.b
            com.ss.android.j.j.cw.b r0 = r0.b
            boolean r0 = com.ss.android.downloadlib.addownload.d.g(r0)
            if (r0 == 0) goto L2b
            boolean r0 = r4.c
            if (r0 != 0) goto L2b
            r0 = 1
            if (r5 == 0) goto L1d
            java.lang.String r5 = r5.ws()
            boolean r5 = com.ss.android.downloadlib.a.h.N(r5)
            if (r5 == 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 2
        L1e:
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "file_status"
            com.ss.android.downloadlib.addownload.o$i r3 = r4.b
            r1.j(r2, r5, r3)
            r4.c = r0
        L2b:
            return
    }

    int c(android.content.Context r12, com.ss.android.socialbase.downloader.r.a r13) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.util.Map r1 = r1.oq()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r4 = "enable_send_click_id_in_apk"
            r5 = 1
            int r3 = r3.optInt(r4, r5)
            if (r3 != r5) goto L3d
            com.ss.android.downloadlib.addownload.o$i r3 = r11.b
            com.ss.android.j.j.cw.b r3 = r3.b
            java.lang.String r3 = r3.ch()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3d
            com.ss.android.downloadlib.addownload.o$i r3 = r11.b
            com.ss.android.j.j.cw.b r3 = r3.b
            java.lang.String r3 = r3.ch()
            com.ss.android.socialbase.downloader.ae.up r3 = r11.e(r3)
            if (r3 == 0) goto L3d
            r2.add(r3)
        L3d:
            if (r1 == 0) goto L6a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L47
            com.ss.android.socialbase.downloader.ae.up r4 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.Object r6 = r3.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.<init>(r6, r3)
            r2.add(r4)
            goto L47
        L6a:
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            long r3 = r1.r()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            com.ss.android.downloadlib.addownload.o$i r3 = r11.b
            com.ss.android.j.j.cw.b r3 = r3.b
            java.lang.String r3 = r3.cw()
            com.ss.android.downloadlib.addownload.o$i r4 = r11.b
            com.ss.android.j.j.cw.b r4 = r4.b
            boolean r4 = r4.qv()
            com.ss.android.downloadlib.addownload.o$i r6 = r11.b
            com.ss.android.j.j.cw.b r6 = r6.b
            int r6 = r6.la()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = com.ss.android.downloadlib.a.l.a(r1, r3, r4, r6)
            com.ss.android.downloadlib.addownload.o$i r3 = r11.b
            com.ss.android.j.j.cw.b r3 = r3.b
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.downloadlib.a.n.x(r3)
            com.ss.android.downloadlib.addownload.o$i r4 = r11.b
            com.ss.android.j.j.cw.b r4 = r4.b
            org.json.JSONObject r4 = com.ss.android.downloadlib.a.n.m(r4)
            com.ss.android.downloadlib.addownload.o$i r6 = r11.b
            com.ss.android.j.j.cw.c r6 = r6.d
            boolean r6 = r6.az()
            if (r6 != 0) goto Lbe
            org.json.JSONObject r4 = com.ss.android.downloadlib.a.h.r(r4)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.lang.String r7 = "ah_plans"
            com.ss.android.downloadlib.a.h.u(r4, r7, r6)
        Lbe:
            com.ss.android.downloadlib.addownload.o$i r6 = r11.b
            com.ss.android.j.j.cw.b r6 = r6.b
            int r6 = r6.ed()
            com.ss.android.downloadlib.addownload.o$i r7 = r11.b
            com.ss.android.j.j.cw.b r7 = r7.b
            boolean r7 = r7.x()
            if (r7 != 0) goto Lda
            com.ss.android.downloadlib.addownload.o$i r7 = r11.b
            com.ss.android.j.j.cw.b r7 = r7.b
            boolean r7 = com.ss.android.downloadlib.addownload.d.l(r7)
            if (r7 == 0) goto Ldb
        Lda:
            r6 = 4
        Ldb:
            java.lang.String r7 = r11.f(r3)
            com.ss.android.downloadlib.addownload.o$i r8 = r11.b
            com.ss.android.j.j.cw.b r8 = r8.b
            java.lang.String r8 = r8.j()
            int r8 = com.ss.android.socialbase.downloader.downloader.cw.j(r8, r7)
            android.content.Context r9 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)
            com.ss.android.socialbase.downloader.ae.cw r8 = r9.tl(r8)
            if (r8 == 0) goto L107
            com.ss.android.downloadlib.addownload.o$i r9 = r11.b
            com.ss.android.j.j.cw.b r9 = r9.b
            int r9 = r9.la()
            r10 = 3
            if (r10 != r9) goto L107
            r8.g(r5)
        L107:
            com.ss.android.socialbase.appdownloader.e r8 = new com.ss.android.socialbase.appdownloader.e
            com.ss.android.downloadlib.addownload.o$i r9 = r11.b
            com.ss.android.j.j.cw.b r9 = r9.b
            java.lang.String r9 = r9.j()
            r8.<init>(r12, r9)
            com.ss.android.downloadlib.addownload.o$i r12 = r11.b
            com.ss.android.j.j.cw.b r12 = r12.b
            java.util.List r12 = r12.xt()
            com.ss.android.socialbase.appdownloader.e r12 = r8.P0(r12)
            com.ss.android.downloadlib.addownload.o$i r8 = r11.b
            com.ss.android.j.j.cw.b r8 = r8.b
            java.lang.String r8 = r8.tl()
            com.ss.android.socialbase.appdownloader.e r12 = r12.I(r8)
            com.ss.android.socialbase.appdownloader.e r12 = r12.B0(r1)
            com.ss.android.socialbase.appdownloader.e r12 = r12.J(r2)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            boolean r1 = r1.vl()
            com.ss.android.socialbase.appdownloader.e r12 = r12.L(r1)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            boolean r1 = r1.jy()
            com.ss.android.socialbase.appdownloader.e r12 = r12.n(r1)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.av()
            com.ss.android.socialbase.appdownloader.e r12 = r12.O0(r1)
            com.ss.android.socialbase.appdownloader.e r12 = r12.m(r7)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.a()
            com.ss.android.socialbase.appdownloader.e r12 = r12.j0(r1)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.up()
            com.ss.android.socialbase.appdownloader.e r12 = r12.w0(r1)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.n()
            com.ss.android.socialbase.appdownloader.e r12 = r12.d0(r1)
            com.ss.android.downloadlib.addownload.o$i r1 = r11.b
            com.ss.android.j.j.cw.b r1 = r1.b
            long r1 = r1.m()
            com.ss.android.socialbase.appdownloader.e r12 = r12.C(r1)
            com.ss.android.socialbase.appdownloader.e r12 = r12.D(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            boolean r13 = r13.tj()
            if (r13 != 0) goto L1a5
            java.lang.String r13 = "need_independent_process"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L1a3
            goto L1a5
        L1a3:
            r13 = 0
            goto L1a6
        L1a5:
            r13 = 1
        L1a6:
            com.ss.android.socialbase.appdownloader.e r12 = r12.F0(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            com.ss.android.socialbase.downloader.r.tj r13 = r13.wq()
            com.ss.android.socialbase.appdownloader.e r12 = r12.F(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            boolean r13 = r13.rn()
            com.ss.android.socialbase.appdownloader.e r12 = r12.Q0(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            java.lang.String r13 = r13.s()
            com.ss.android.socialbase.appdownloader.e r12 = r12.b(r13)
            r13 = 1000(0x3e8, float:1.401E-42)
            com.ss.android.socialbase.appdownloader.e r12 = r12.m0(r13)
            r13 = 100
            com.ss.android.socialbase.appdownloader.e r12 = r12.A0(r13)
            com.ss.android.socialbase.appdownloader.e r12 = r12.K(r4)
            com.ss.android.socialbase.appdownloader.e r12 = r12.u(r5)
            com.ss.android.socialbase.appdownloader.e r12 = r12.e0(r5)
            java.lang.String r13 = "retry_count"
            r1 = 5
            int r13 = r3.j(r13, r1)
            com.ss.android.socialbase.appdownloader.e r12 = r12.N0(r13)
            java.lang.String r13 = "backup_url_retry_count"
            int r13 = r3.j(r13, r0)
            com.ss.android.socialbase.appdownloader.e r12 = r12.l(r13)
            com.ss.android.socialbase.appdownloader.e r12 = r12.e0(r5)
            java.lang.String r13 = "need_head_connection"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L209
            r13 = 1
            goto L20a
        L209:
            r13 = 0
        L20a:
            com.ss.android.socialbase.appdownloader.e r12 = r12.O(r13)
            java.lang.String r13 = "need_https_to_http_retry"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L218
            r13 = 1
            goto L219
        L218:
            r13 = 0
        L219:
            com.ss.android.socialbase.appdownloader.e r12 = r12.o0(r13)
            java.lang.String r13 = "need_chunk_downgrade_retry"
            int r13 = r3.j(r13, r5)
            if (r13 != r5) goto L227
            r13 = 1
            goto L228
        L227:
            r13 = 0
        L228:
            com.ss.android.socialbase.appdownloader.e r12 = r12.x0(r13)
            java.lang.String r13 = "need_retry_delay"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L236
            r13 = 1
            goto L237
        L236:
            r13 = 0
        L237:
            com.ss.android.socialbase.appdownloader.e r12 = r12.c(r13)
            java.lang.String r13 = "retry_delay_time_array"
            java.lang.String r13 = r3.cw(r13)
            com.ss.android.socialbase.appdownloader.e r12 = r12.t(r13)
            java.lang.String r13 = "need_reuse_runnable"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L24f
            r13 = 1
            goto L250
        L24f:
            r13 = 0
        L250:
            com.ss.android.socialbase.appdownloader.e r12 = r12.k0(r13)
            com.ss.android.socialbase.appdownloader.e r12 = r12.V(r6)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            boolean r13 = r13.nd()
            com.ss.android.socialbase.appdownloader.e r12 = r12.e(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            boolean r13 = r13.rh()
            com.ss.android.socialbase.appdownloader.e r12 = r12.g(r13)
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            java.lang.String r13 = r13.g()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L28a
            com.ss.android.downloadlib.addownload.o$i r13 = r11.b
            com.ss.android.j.j.cw.b r13 = r13.b
            java.lang.String r13 = r13.g()
            r12.W(r13)
            goto L28f
        L28a:
            java.lang.String r13 = "application/vnd.android.package-archive"
            r12.W(r13)
        L28f:
            java.lang.String r13 = "notification_opt_2"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L29d
            r12.L(r0)
            r12.Q0(r5)
        L29d:
            java.lang.String r13 = "clear_space_use_disk_handler"
            int r13 = r3.j(r13, r0)
            if (r13 != r5) goto L2ae
            com.ss.android.downloadlib.addownload.c$c r13 = new com.ss.android.downloadlib.addownload.c$c
            r13.<init>()
            r12.E(r13)
            goto L2af
        L2ae:
            r13 = 0
        L2af:
            com.ss.android.downloadlib.addownload.o$i r0 = r11.b
            com.ss.android.j.j.cw.b r0 = r0.b
            boolean r1 = r0 instanceof com.ss.android.xt.j.j.a
            if (r1 == 0) goto L2d0
            com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
            java.lang.String r0 = r0.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d0
            com.ss.android.downloadlib.addownload.o$i r0 = r11.b
            com.ss.android.j.j.cw.b r0 = r0.b
            com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
            java.lang.String r0 = r0.k()
            r12.n0(r0)
        L2d0:
            com.ss.android.downloadlib.addownload.o$i r0 = r11.b
            boolean r1 = r11.b()
            int r12 = com.ss.android.downloadlib.addownload.d.b(r0, r1, r12)
            if (r13 == 0) goto L2df
            r13.b(r12)
        L2df:
            return r12
    }

    void h() {
            r1 = this;
            com.ss.android.downloadlib.addownload.k$e r0 = r1.e
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.k$c r0 = new com.ss.android.downloadlib.addownload.k$c
            r0.<init>(r1)
            r1.e = r0
        Lb:
            return
    }

    public void i(long r2) {
            r1 = this;
            r1.a = r2
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r2 = r0.r(r2)
            r1.b = r2
            boolean r2 = r2.b()
            if (r2 == 0) goto L1b
            com.ss.android.downloadlib.up.a r2 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r3 = "setAdId ModelBox notValid"
            r2.c(r3)
        L1b:
            return
    }

    @Override // com.ss.android.downloadlib.a.p.InterfaceC0196a
    public void j(android.os.Message r1) {
            r0 = this;
            return
    }

    void k(android.os.Message r13, com.ss.android.j.j.up.e r14, java.util.Map<java.lang.Integer, java.lang.Object> r15) {
            r12 = this;
            if (r13 == 0) goto Lee
            int r0 = r13.what
            r1 = 3
            if (r0 == r1) goto L9
            goto Lee
        L9:
            java.lang.Object r0 = r13.obj
            com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            int r13 = r13.arg1
            r2 = 0
            r3 = 2
            r4 = 1
            if (r13 == r4) goto L38
            r5 = 6
            if (r13 == r5) goto L38
            if (r13 != r3) goto L38
            boolean r13 = r0.fp()
            if (r13 == 0) goto L31
            com.ss.android.downloadlib.c r13 = com.ss.android.downloadlib.c.d()
            com.ss.android.downloadlib.addownload.o$i r5 = r12.b
            com.ss.android.j.j.cw.b r6 = r5.b
            com.ss.android.j.j.cw.c r7 = r5.d
            com.ss.android.j.j.cw.g r5 = r5.c
            r13.h(r6, r7, r5)
            r0.g(r2)
        L31:
            com.ss.android.downloadlib.r.b r13 = com.ss.android.downloadlib.r.b.a()
            r13.h(r0)
        L38:
            r14.a(r0)
            com.ss.android.downloadlib.addownload.h.c(r14)
            int r13 = r0.i()
            int r13 = com.ss.android.socialbase.appdownloader.b.f(r13)
            long r5 = r0.ka()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L5a
            long r7 = r0.uq()
            r10 = 100
            long r7 = r7 * r10
            long r7 = r7 / r5
            int r2 = (int) r7
        L5a:
            if (r9 > 0) goto L68
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r6 = "fix_click_start"
            boolean r5 = r5.j(r6)
            if (r5 == 0) goto L72
        L68:
            com.ss.android.downloadlib.addownload.k$e r5 = r12.e
            if (r5 == 0) goto L72
            r5.j(r0)
            r5 = 0
            r12.e = r5
        L72:
            java.util.List r5 = g(r15)
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lee
            java.lang.Object r6 = r5.next()
            com.ss.android.j.j.cw.e r6 = (com.ss.android.j.j.cw.e) r6
            if (r13 == r4) goto Lc8
            if (r13 == r3) goto Lbc
            if (r13 == r1) goto L8d
            goto L7a
        L8d:
            int r7 = r0.i()
            r8 = -4
            if (r7 != r8) goto L98
            r6.j()
            goto L7a
        L98:
            int r7 = r0.i()
            r8 = -1
            if (r7 != r8) goto La3
            r6.onDownloadFailed(r14)
            goto L7a
        La3:
            int r7 = r0.i()
            r8 = -3
            if (r7 != r8) goto L7a
            com.ss.android.downloadlib.addownload.o$i r7 = r12.b
            com.ss.android.j.j.cw.b r7 = r7.b
            boolean r7 = com.ss.android.downloadlib.a.h.z(r7)
            if (r7 == 0) goto Lb8
            r6.onInstalled(r14)
            goto L7a
        Lb8:
            r6.onDownloadFinished(r14)
            goto L7a
        Lbc:
            int r7 = r0.ae()
            int r7 = com.ss.android.downloadlib.addownload.h.a(r7, r2)
            r6.onDownloadPaused(r14, r7)
            goto L7a
        Lc8:
            int r7 = r0.i()
            r8 = 11
            if (r7 == r8) goto Ldc
            int r7 = r0.ae()
            int r7 = com.ss.android.downloadlib.addownload.h.a(r7, r2)
            r6.onDownloadActive(r14, r7)
            goto L7a
        Ldc:
            java.util.List r6 = A(r15)
            java.util.Iterator r6 = r6.iterator()
        Le4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7a
            r6.next()
            goto Le4
        Lee:
            return
    }

    public void l(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.B(r2)
            return
    }

    void m(com.ss.android.socialbase.downloader.ae.cw r7, com.ss.android.j.j.up.e r8, java.util.List<com.ss.android.j.j.cw.e> r9, boolean r10) {
            r6 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            goto Lae
        L8:
            if (r7 == 0) goto L9a
            if (r8 != 0) goto Le
            goto L9a
        Le:
            r0 = 0
            long r1 = r7.ka()     // Catch: java.lang.Exception -> L28
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2c
            long r1 = r7.uq()     // Catch: java.lang.Exception -> L28
            r3 = 100
            long r1 = r1 * r3
            long r3 = r7.ka()     // Catch: java.lang.Exception -> L28
            long r1 = r1 / r3
            int r2 = (int) r1
            goto L2d
        L28:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L2c:
            r2 = 0
        L2d:
            if (r2 >= 0) goto L30
            goto L31
        L30:
            r0 = r2
        L31:
            r8.a(r7)
            com.ss.android.downloadlib.addownload.h.c(r8)
            java.util.Iterator r9 = r9.iterator()
        L3b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r9.next()
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            int r2 = r7.i()
            switch(r2) {
                case -4: goto L85;
                case -3: goto L7b;
                case -2: goto L6f;
                case -1: goto L6b;
                case 0: goto L85;
                case 1: goto L5f;
                case 2: goto L5f;
                case 3: goto L5f;
                case 4: goto L5f;
                case 5: goto L5f;
                case 6: goto L4e;
                case 7: goto L5f;
                case 8: goto L5f;
                case 9: goto L4e;
                case 10: goto L4e;
                case 11: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L3b
        L4f:
            boolean r2 = r1 instanceof com.ss.android.j.j.cw.f
            if (r2 != 0) goto L3b
            int r2 = r7.ae()
            int r2 = com.ss.android.downloadlib.addownload.h.a(r2, r0)
            r1.onDownloadActive(r8, r2)
            goto L3b
        L5f:
            int r2 = r7.ae()
            int r2 = com.ss.android.downloadlib.addownload.h.a(r2, r0)
            r1.onDownloadActive(r8, r2)
            goto L3b
        L6b:
            r1.onDownloadFailed(r8)
            goto L3b
        L6f:
            int r2 = r7.ae()
            int r2 = com.ss.android.downloadlib.addownload.h.a(r2, r0)
            r1.onDownloadPaused(r8, r2)
            goto L3b
        L7b:
            if (r10 == 0) goto L81
            r1.onInstalled(r8)
            goto L3b
        L81:
            r1.onDownloadFinished(r8)
            goto L3b
        L85:
            com.ss.android.downloadlib.addownload.o$i r2 = r6.b
            com.ss.android.j.j.cw.b r2 = r2.b
            boolean r2 = com.ss.android.downloadlib.a.h.z(r2)
            if (r2 == 0) goto L96
            r2 = -3
            r8.b = r2
            r1.onInstalled(r8)
            goto L3b
        L96:
            r1.j()
            goto L3b
        L9a:
            java.util.Iterator r7 = r9.iterator()
        L9e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lae
            java.lang.Object r8 = r7.next()
            com.ss.android.j.j.cw.e r8 = (com.ss.android.j.j.cw.e) r8
            r8.j()
            goto L9e
        Lae:
            return
    }

    void n(com.ss.android.socialbase.downloader.ae.cw r6, boolean r7) {
            r5 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r5.b
            com.ss.android.j.j.cw.b r0 = r0.b
            if (r0 == 0) goto Lf2
            if (r6 == 0) goto Lf2
            int r0 = r6.ae()
            if (r0 != 0) goto L10
            goto Lf2
        L10:
            int r0 = r6.i()
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L42
            r1 = -4
            if (r0 != r1) goto L1c
            goto L42
        L1c:
            com.ss.android.downloadlib.addownload.o$i r1 = r5.b
            com.ss.android.j.j.cw.b r1 = r1.b
            boolean r1 = com.ss.android.downloadlib.addownload.d.g(r1)
            if (r1 != 0) goto L38
            if (r7 == 0) goto L4b
            com.ss.android.downloadlib.r.a r1 = com.ss.android.downloadlib.r.a.c()
            boolean r1 = r1.b()
            if (r1 == 0) goto L4b
            r1 = -2
            if (r0 == r1) goto L38
            r1 = -3
            if (r0 != r1) goto L4b
        L38:
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            long r3 = r5.a
            r1.c(r3, r2)
            goto L4b
        L42:
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            long r3 = r5.a
            r1.c(r3, r2)
        L4b:
            switch(r0) {
                case -4: goto Ld7;
                case -3: goto L8f;
                case -2: goto L5b;
                case -1: goto Ld7;
                case 0: goto L4e;
                case 1: goto L50;
                case 2: goto L50;
                case 3: goto L50;
                case 4: goto L50;
                case 5: goto L50;
                case 6: goto L4e;
                case 7: goto L50;
                case 8: goto L50;
                default: goto L4e;
            }
        L4e:
            goto Lf2
        L50:
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
            long r0 = r5.a
            r2 = 3
            r7.d(r0, r2, r6)
            return
        L5b:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            long r3 = r5.a
            r1 = 4
            r0.d(r3, r1, r6)
            if (r7 == 0) goto Lf2
            com.ss.android.downloadlib.r.a r6 = com.ss.android.downloadlib.r.a.c()
            boolean r6 = r6.e()
            if (r6 == 0) goto Lf2
            com.ss.android.downloadlib.r.a r6 = com.ss.android.downloadlib.r.a.c()
            long r0 = r5.a
            com.ss.android.downloadlib.addownload.o$i r7 = r5.b
            com.ss.android.j.j.cw.b r7 = r7.b
            java.lang.String r7 = r7.ch()
            boolean r6 = r6.f(r0, r7)
            if (r6 != 0) goto Lf2
            com.ss.android.downloadlib.r.b r6 = com.ss.android.downloadlib.r.b.a()
            long r0 = r5.a
            r6.c(r0, r2)
            return
        L8f:
            com.ss.android.downloadlib.addownload.o$i r0 = r5.b
            com.ss.android.j.j.cw.b r0 = r0.b
            boolean r0 = com.ss.android.downloadlib.a.h.z(r0)
            if (r0 == 0) goto La3
            com.ss.android.downloadlib.up.a r6 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r7 = "SUCCESSED isInstalledApp"
            r6.f(r7)
            return
        La3:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            long r3 = r5.a
            r1 = 5
            r0.d(r3, r1, r6)
            if (r7 == 0) goto Lf2
            com.ss.android.downloadlib.r.a r6 = com.ss.android.downloadlib.r.a.c()
            boolean r6 = r6.e()
            if (r6 == 0) goto Lf2
            com.ss.android.downloadlib.r.a r6 = com.ss.android.downloadlib.r.a.c()
            long r0 = r5.a
            com.ss.android.downloadlib.addownload.o$i r7 = r5.b
            com.ss.android.j.j.cw.b r7 = r7.b
            java.lang.String r7 = r7.ch()
            boolean r6 = r6.f(r0, r7)
            if (r6 != 0) goto Lf2
            com.ss.android.downloadlib.r.b r6 = com.ss.android.downloadlib.r.b.a()
            long r0 = r5.a
            r6.c(r0, r2)
            return
        Ld7:
            r5.h()
            com.ss.android.downloadlib.addownload.o$f r7 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = new com.ss.android.xt.j.xt.b
            com.ss.android.downloadlib.addownload.o$i r1 = r5.b
            com.ss.android.j.j.cw.b r2 = r1.b
            com.ss.android.j.j.cw.g r3 = r1.c
            com.ss.android.j.j.cw.c r1 = r1.d
            int r6 = r6.ae()
            r0.<init>(r2, r3, r1, r6)
            r7.l(r0)
        Lf2:
            return
    }

    void o(@androidx.annotation.NonNull v2.t r5) {
            r4 = this;
            java.lang.String r0 = "/cache"
            com.ss.android.downloadlib.addownload.o$i r1 = r4.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.az()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            com.ss.android.downloadlib.addownload.o$i r1 = r4.b
            com.ss.android.j.j.cw.b r1 = r1.b
            java.lang.String r1 = r1.az()
            java.io.File r2 = android.os.Environment.getDataDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L2a
            r5.j()
            return
        L2a:
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L4f
            java.io.File r2 = r2.getExternalCacheDir()     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r2.getParent()     // Catch: java.lang.Exception -> L4f
            boolean r3 = r2.endsWith(r0)     // Catch: java.lang.Exception -> L4f
            if (r3 == 0) goto L45
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L4f
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r0)     // Catch: java.lang.Exception -> L4f
        L45:
            boolean r0 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L4f
            r5.j()     // Catch: java.lang.Exception -> L4f
            return
        L4f:
            com.ss.android.downloadlib.addownload.k$a r0 = new com.ss.android.downloadlib.addownload.k$a
            r0.<init>(r4, r5)
            r4.C(r0)
            return
    }

    public boolean p(int r5) {
            r4 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = r4.b
            com.ss.android.j.j.cw.c r0 = r0.d
            int r0 = r0.xt()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Lf
            if (r5 != r2) goto Lf
            return r1
        Lf:
            com.ss.android.downloadlib.addownload.o$i r0 = r4.b
            com.ss.android.j.j.cw.c r0 = r0.d
            int r0 = r0.xt()
            r3 = 0
            if (r0 != r2) goto L29
            if (r5 != r1) goto L29
            org.json.JSONObject r5 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r0 = "disable_lp_if_market"
            int r5 = r5.optInt(r0, r3)
            if (r5 != r1) goto L29
            return r1
        L29:
            return r3
    }

    public boolean q(int r2, com.ss.android.j.j.cw.b r3) {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.appdownloader.m.e.e()
            if (r0 == 0) goto L14
            boolean r2 = r1.p(r2)
            if (r2 == 0) goto L14
            boolean r2 = com.ss.android.downloadlib.a.h.z(r3)
            if (r2 != 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    boolean r(android.content.Context r4, int r5, boolean r6) {
            r3 = this;
            com.ss.android.downloadlib.addownload.o$i r4 = r3.b
            com.ss.android.j.j.cw.b r4 = r4.b
            boolean r4 = com.ss.android.downloadlib.a.h.z(r4)
            if (r4 == 0) goto L2a
            com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r5 = r3.b
            long r5 = r5.a
            com.ss.android.xt.j.xt.b r4 = r4.q(r5)
            if (r4 == 0) goto L23
            com.ss.android.socialbase.downloader.notification.xt r5 = com.ss.android.socialbase.downloader.notification.xt.j()
            int r4 = r4.mi()
            r5.m(r4)
        L23:
            com.ss.android.downloadlib.addownload.o$i r4 = r3.b
            boolean r4 = com.ss.android.downloadlib.j.g.g(r4)
            return r4
        L2a:
            boolean r4 = r3.p(r5)
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L67
            com.ss.android.downloadlib.addownload.o$i r4 = r3.b
            com.ss.android.j.j.cw.b r4 = r4.b
            java.lang.String r4 = r4.s()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L67
            org.json.JSONObject r4 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "disable_market"
            int r4 = r4.optInt(r2)
            if (r4 == r1) goto L67
            com.ss.android.downloadlib.addownload.o$i r4 = r3.b
            boolean r4 = com.ss.android.downloadlib.j.g.h(r4, r5)
            if (r4 == 0) goto L55
            return r1
        L55:
            com.ss.android.downloadlib.addownload.l r4 = r3.d
            boolean r4 = r4.q()
            if (r4 == 0) goto L66
            com.ss.android.downloadlib.addownload.l r4 = r3.d
            boolean r4 = r4.N(r1)
            if (r4 == 0) goto L66
            return r1
        L66:
            return r0
        L67:
            if (r6 == 0) goto L82
            com.ss.android.downloadlib.addownload.o$i r4 = r3.b
            com.ss.android.j.j.cw.c r4 = r4.d
            int r4 = r4.xt()
            r5 = 4
            if (r4 != r5) goto L82
            com.ss.android.downloadlib.addownload.l r4 = r3.d
            boolean r4 = r4.S()
            if (r4 != 0) goto L82
            com.ss.android.downloadlib.addownload.l r4 = r3.d
            r4.n(r1)
            return r1
        L82:
            return r0
    }

    boolean s(boolean r2) {
            r1 = this;
            if (r2 != 0) goto Le
            com.ss.android.downloadlib.addownload.o$i r2 = r1.b
            com.ss.android.j.j.cw.c r2 = r2.d
            int r2 = r2.xt()
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    boolean w(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            boolean r0 = r1.t()
            if (r0 != 0) goto Lf
            boolean r2 = r1.y(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.String z() {
            r2 = this;
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = r0.getExternalFilesDir(r1)
            if (r0 == 0) goto L20
            boolean r1 = r0.exists()
            if (r1 != 0) goto L15
            r0.mkdirs()
        L15:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L20
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L20:
            r0 = 0
            return r0
    }
}

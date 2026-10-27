package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"InlinedApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    protected static final java.lang.String[] a = null;

    /* renamed from: b, reason: collision with root package name */
    protected final com.beizi.ad.internal.view.AdWebView f7204b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7205c;

    /* renamed from: d, reason: collision with root package name */
    boolean f7206d;

    /* renamed from: e, reason: collision with root package name */
    int f7207e;

    /* renamed from: f, reason: collision with root package name */
    int f7208f;

    /* renamed from: g, reason: collision with root package name */
    int f7209g;

    /* renamed from: h, reason: collision with root package name */
    boolean f7210h;

    /* renamed from: i, reason: collision with root package name */
    boolean f7211i;

    /* renamed from: j, reason: collision with root package name */
    boolean f7212j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7213k;
    private int l;
    private int m;
    private android.app.Activity n;
    private android.view.ViewGroup o;
    private int[] p;
    private int q;
    private boolean r;
    private com.beizi.ad.internal.view.g s;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.view.f$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.AdActivity$b[] r0 = com.beizi.ad.AdActivity.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.view.f.AnonymousClass4.a = r0
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.f6424b     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.view.f.AnonymousClass4.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.view.f.AnonymousClass4.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.f6425c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.beizi.ad.internal.view.f.a> {
        public static final com.beizi.ad.internal.view.f.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7217b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7218c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7219d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7220e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7221f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.a f7222g = null;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.internal.view.f.a[] f7223h = null;

        static {
                com.beizi.ad.internal.view.f$a r0 = new com.beizi.ad.internal.view.f$a
                java.lang.String r1 = "top_left"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.internal.view.f.a.a = r0
                com.beizi.ad.internal.view.f$a r1 = new com.beizi.ad.internal.view.f$a
                java.lang.String r3 = "top_right"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.internal.view.f.a.f7217b = r1
                com.beizi.ad.internal.view.f$a r3 = new com.beizi.ad.internal.view.f$a
                java.lang.String r5 = "center"
                r6 = 2
                r3.<init>(r5, r6)
                com.beizi.ad.internal.view.f.a.f7218c = r3
                com.beizi.ad.internal.view.f$a r5 = new com.beizi.ad.internal.view.f$a
                java.lang.String r7 = "bottom_left"
                r8 = 3
                r5.<init>(r7, r8)
                com.beizi.ad.internal.view.f.a.f7219d = r5
                com.beizi.ad.internal.view.f$a r7 = new com.beizi.ad.internal.view.f$a
                java.lang.String r9 = "bottom_right"
                r10 = 4
                r7.<init>(r9, r10)
                com.beizi.ad.internal.view.f.a.f7220e = r7
                com.beizi.ad.internal.view.f$a r9 = new com.beizi.ad.internal.view.f$a
                java.lang.String r11 = "top_center"
                r12 = 5
                r9.<init>(r11, r12)
                com.beizi.ad.internal.view.f.a.f7221f = r9
                com.beizi.ad.internal.view.f$a r11 = new com.beizi.ad.internal.view.f$a
                java.lang.String r13 = "bottom_center"
                r14 = 6
                r11.<init>(r13, r14)
                com.beizi.ad.internal.view.f.a.f7222g = r11
                r13 = 7
                com.beizi.ad.internal.view.f$a[] r13 = new com.beizi.ad.internal.view.f.a[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.beizi.ad.internal.view.f.a.f7223h = r13
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.internal.view.f.a valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.internal.view.f$a> r0 = com.beizi.ad.internal.view.f.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.internal.view.f$a r1 = (com.beizi.ad.internal.view.f.a) r1
                return r1
        }

        public static com.beizi.ad.internal.view.f.a[] values() {
                com.beizi.ad.internal.view.f$a[] r0 = com.beizi.ad.internal.view.f.a.f7223h
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.internal.view.f$a[] r0 = (com.beizi.ad.internal.view.f.a[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected enum b extends java.lang.Enum<com.beizi.ad.internal.view.f.b> {
        public static final com.beizi.ad.internal.view.f.b a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.f.b f7224b = null;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.internal.view.f.b[] f7225c = null;

        static {
                com.beizi.ad.internal.view.f$b r0 = new com.beizi.ad.internal.view.f$b
                java.lang.String r1 = "STARTING_DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.internal.view.f.b.a = r0
                com.beizi.ad.internal.view.f$b r1 = new com.beizi.ad.internal.view.f$b
                java.lang.String r3 = "STARTING_EXPANDED"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.internal.view.f.b.f7224b = r1
                r3 = 2
                com.beizi.ad.internal.view.f$b[] r3 = new com.beizi.ad.internal.view.f.b[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.beizi.ad.internal.view.f.b.f7225c = r3
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.internal.view.f.b valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.internal.view.f$b> r0 = com.beizi.ad.internal.view.f.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.internal.view.f$b r1 = (com.beizi.ad.internal.view.f.b) r1
                return r1
        }

        public static com.beizi.ad.internal.view.f.b[] values() {
                com.beizi.ad.internal.view.f$b[] r0 = com.beizi.ad.internal.view.f.b.f7225c
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.internal.view.f$b[] r0 = (com.beizi.ad.internal.view.f.b[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "default"
            java.lang.String r1 = "expanded"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.beizi.ad.internal.view.f.a = r0
            return
    }

    public f(com.beizi.ad.internal.view.AdWebView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f7213k = r0
            r2.f7205c = r0
            r2.f7206d = r0
            r2.f7210h = r0
            r2.f7211i = r0
            r1 = 4
            int[] r1 = new int[r1]
            r2.p = r1
            r2.r = r0
            r0 = 0
            r2.s = r0
            r2.f7204b = r3
            return
    }

    private com.beizi.ad.AdActivity.b a(java.lang.String r3) {
            r2 = this;
            com.beizi.ad.AdActivity$b r0 = com.beizi.ad.AdActivity.b.f6425c
            java.lang.String r1 = "landscape"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Ld
            com.beizi.ad.AdActivity$b r3 = com.beizi.ad.AdActivity.b.f6424b
            return r3
        Ld:
            java.lang.String r1 = "portrait"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L18
            com.beizi.ad.AdActivity$b r3 = com.beizi.ad.AdActivity.b.a
            return r3
        L18:
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.view.g a(com.beizi.ad.internal.view.f r0) {
            com.beizi.ad.internal.view.g r0 = r0.s
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void a(com.beizi.ad.internal.view.AdWebView r6) {
            r5 = this;
            java.lang.String r0 = "android.intent.action.EDIT"
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "sms:5555555555"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            boolean r1 = r5.a(r1)
            r2 = 1
            if (r1 == 0) goto L1b
            java.lang.String r1 = "sms"
            r5.a(r6, r1, r2)
        L1b:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "tel:5555555555"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r1.<init>(r3, r4)
            boolean r1 = r5.a(r1)
            if (r1 == 0) goto L31
            java.lang.String r1 = "tel"
            r5.a(r6, r1, r2)
        L31:
            java.lang.String r1 = "Y29udGVudDovL2NvbS5hbmRyb2lkLmNhbGVuZGFyL2V2ZW50cw=="
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L6a
            r3.<init>(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = com.beizi.ad.lance.a.b.b(r1)     // Catch: java.lang.Exception -> L6a
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L6a
            android.content.Intent r1 = r3.setData(r1)     // Catch: java.lang.Exception -> L6a
            boolean r1 = r5.a(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = "calendar"
            if (r1 == 0) goto L52
            r5.a(r6, r3, r2)     // Catch: java.lang.Exception -> L6a
            r5.f7211i = r2     // Catch: java.lang.Exception -> L6a
            goto L6a
        L52:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L6a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "vnd.android.cursor.item/event"
            android.content.Intent r0 = r1.setType(r0)     // Catch: java.lang.Exception -> L6a
            boolean r0 = r5.a(r0)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L6a
            r5.a(r6, r3, r2)     // Catch: java.lang.Exception -> L6a
            r5.f7211i = r2     // Catch: java.lang.Exception -> L6a
            com.beizi.ad.internal.h.v.a = r2     // Catch: java.lang.Exception -> L6a
        L6a:
            java.lang.String r0 = "inlineVideo"
            r5.a(r6, r0, r2)
            return
    }

    private void a(com.beizi.ad.internal.view.AdWebView r3, java.lang.String r4, boolean r5) {
            r2 = this;
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r4 = "javascript:window.mraid.util.setSupports('%s', %s)"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.c(r4)
            return
    }

    private void c(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r5) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "uri"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = android.net.Uri.decode(r0)
            goto L5
        L26:
            boolean r5 = com.beizi.ad.internal.h.o.a(r0)
            if (r5 != 0) goto L36
            com.beizi.ad.internal.view.AdWebView r5 = r4.f7204b
            r5.b(r0)
            com.beizi.ad.internal.view.AdWebView r5 = r4.f7204b
            r5.c()
        L36:
            return
    }

    private void d(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r5) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "uri"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            goto L5
        L22:
            if (r0 != 0) goto L25
            return
        L25:
            java.lang.String r5 = android.net.Uri.decode(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            com.beizi.ad.internal.view.AdWebView r1 = r4.f7204b
            android.content.Context r1 = com.beizi.ad.internal.h.u.b(r1)
            r0.<init>(r1)
            int r1 = com.beizi.fusion.R.string.beizi_store_picture_title
            r0.setTitle(r1)
            int r1 = com.beizi.fusion.R.string.beizi_store_picture_message
            r0.setMessage(r1)
            int r1 = com.beizi.fusion.R.string.beizi_store_picture_accept
            com.beizi.ad.internal.view.f$2 r2 = new com.beizi.ad.internal.view.f$2
            r2.<init>(r4, r5)
            r0.setPositiveButton(r1, r2)
            int r5 = com.beizi.fusion.R.string.beizi_store_picture_decline
            com.beizi.ad.internal.view.f$3 r1 = new com.beizi.ad.internal.view.f$3
            r1.<init>(r4)
            r0.setNegativeButton(r5, r1)
            android.app.AlertDialog r5 = r0.create()
            r5.show()
            return
    }

    private void e() {
            r9 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r9.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto Lb
            return
        Lb:
            com.beizi.ad.internal.view.AdWebView r0 = r9.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2
            int[] r2 = new int[r1]
            com.beizi.ad.internal.view.AdWebView r3 = r9.f7204b
            r3.getLocationOnScreen(r2)
            android.view.Window r3 = r0.getWindow()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            int r3 = r3.getTop()
            r4 = 1
            r5 = r2[r4]
            int r5 = r5 - r3
            r2[r4] = r5
            com.beizi.ad.internal.view.AdWebView r3 = r9.f7204b
            r5 = 0
            r3.measure(r5, r5)
            com.beizi.ad.internal.view.AdWebView r3 = r9.f7204b
            int r3 = r3.getMeasuredWidth()
            com.beizi.ad.internal.view.AdWebView r6 = r9.f7204b
            int r6 = r6.getMeasuredHeight()
            int[] r3 = new int[]{r3, r6}
            com.beizi.ad.internal.h.u.a(r0, r3)
            com.beizi.ad.internal.view.AdWebView r0 = r9.f7204b
            r6 = r2[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = r3[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3 = r3[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r6
            r8[r4] = r2
            r8[r1] = r7
            r1 = 3
            r8[r1] = r3
            java.lang.String r1 = "javascript:window.mraid.util.setDefaultPosition(%d, %d, %d, %d)"
            java.lang.String r1 = java.lang.String.format(r1, r8)
            r0.c(r1)
            return
    }

    private void e(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r5) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "uri"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            goto L5
        L22:
            if (r0 != 0) goto L25
            goto L4e
        L25:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r5.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r5.setFlags(r1)
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.lang.Throwable -> L4e
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "video/mp4"
            r5.setDataAndType(r0, r1)     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.view.AdWebView r0 = r4.f7204b
            android.content.Context r0 = r0.getContext()
            r0.startActivity(r5)
            com.beizi.ad.internal.view.AdWebView r5 = r4.f7204b
            r5.c()
        L4e:
            return
    }

    private void f() {
            r5 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r5.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L63
            com.beizi.ad.internal.view.AdWebView r0 = r5.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r1 = com.beizi.ad.internal.h.u.a(r0)
            r2 = 0
            r2 = r1[r2]
            r3 = 1
            r1 = r1[r3]
            android.view.Window r3 = r0.getWindow()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            int r3 = r3.getTop()
            int r1 = r1 - r3
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 / r0
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1
            float r2 = (float) r2
            float r2 = r2 / r0
            float r2 = r2 + r3
            int r0 = (int) r2
            com.beizi.ad.internal.view.AdWebView r2 = r5.f7204b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "javascript:window.mraid.util.setMaxSize("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.c(r0)
        L63:
            return
    }

    private void f(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r2) {
            r1 = this;
            if (r2 == 0) goto L1e
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L38
            if (r0 <= 0) goto L1e
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L38
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.lang.Throwable -> L38
            com.beizi.ad.internal.h.v r2 = com.beizi.ad.internal.h.v.j(r2)     // Catch: java.lang.Throwable -> L38
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L38
            android.content.Intent r2 = r2.j()
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)
            com.beizi.ad.internal.view.AdWebView r0 = r1.f7204b
            android.content.Context r0 = r0.getContext()
            r0.startActivity(r2)
            com.beizi.ad.internal.view.AdWebView r2 = r1.f7204b
            r2.c()
        L38:
            return
    }

    private void g() {
            r3 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L47
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.beizi.ad.internal.h.u.b(r0)
            r1 = 0
            r1 = r0[r1]
            r3.l = r1
            r1 = 1
            r0 = r0[r1]
            r3.m = r0
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "javascript:window.mraid.util.setScreenSize("
            r1.append(r2)
            int r2 = r3.l
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r2 = r3.m
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.c(r1)
        L47:
            return
    }

    private void g(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r7) {
            r6 = this;
            com.beizi.ad.AdActivity$b r0 = com.beizi.ad.AdActivity.b.f6425c
            java.util.Iterator r7 = r7.iterator()
            r1 = 1
            r2 = 1
        L8:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r7.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r4 = r3.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "allow_orientation_change"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L29
            java.lang.Object r2 = r3.second
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            goto L8
        L29:
            java.lang.Object r4 = r3.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "force_orientation"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L8
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            com.beizi.ad.AdActivity$b r0 = r6.a(r0)
            goto L8
        L3e:
            boolean r7 = r6.f7205c     // Catch: java.lang.Throwable -> L76
            if (r7 != 0) goto L4c
            com.beizi.ad.internal.view.AdWebView r7 = r6.f7204b     // Catch: java.lang.Throwable -> L76
            com.beizi.ad.internal.view.AdViewImpl r7 = r7.adViewImpl     // Catch: java.lang.Throwable -> L76
            boolean r7 = r7.e()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L76
        L4c:
            com.beizi.ad.internal.view.AdWebView r7 = r6.f7204b     // Catch: java.lang.Throwable -> L76
            boolean r3 = r7.a     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L57
            android.app.Activity r7 = r6.c()     // Catch: java.lang.Throwable -> L76
            goto L5d
        L57:
            android.content.Context r7 = com.beizi.ad.internal.h.u.b(r7)     // Catch: java.lang.Throwable -> L76
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L76
        L5d:
            if (r2 == 0) goto L63
            com.beizi.ad.AdActivity.b(r7)     // Catch: java.lang.Throwable -> L76
            return
        L63:
            int[] r2 = com.beizi.ad.internal.view.f.AnonymousClass4.a     // Catch: java.lang.Throwable -> L76
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L76
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L76
            r2 = 2
            if (r0 == r1) goto L72
            if (r0 == r2) goto L73
            r1 = 0
            goto L73
        L72:
            r1 = 2
        L73:
            com.beizi.ad.AdActivity.a(r7, r1)     // Catch: java.lang.Throwable -> L76
        L76:
            return
    }

    private void h(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r12) {
            r11 = this;
            java.util.Iterator r12 = r12.iterator()
            r0 = -1
            r1 = 0
            java.lang.String r2 = "top-right"
            r3 = 1
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r10 = 1
        Le:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r12.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "w"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto L30
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9a
            r5 = r0
            goto Le
        L30:
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "h"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto L46
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9a
            r6 = r0
            goto Le
        L46:
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "offset_x"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto L5c
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9a
            r7 = r0
            goto Le
        L5c:
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "offset_y"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto L72
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9a
            r8 = r0
            goto Le
        L72:
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "custom_close_position"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto L84
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            r2 = r0
            goto Le
        L84:
            java.lang.Object r1 = r0.first     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r4 = "allow_offscreen"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.NumberFormatException -> L9a
            if (r1 == 0) goto Le
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L9a
            boolean r10 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.NumberFormatException -> L9a
            goto Le
        L9a:
            return
        L9b:
            int r12 = r11.l
            if (r5 <= r12) goto Lab
            int r12 = r11.m
            if (r6 <= r12) goto Lab
            com.beizi.ad.internal.view.AdWebView r12 = r11.f7204b
            java.lang.String r0 = "javascript:mraid.util.errorEvent('Resize called with resizeProperties larger than the screen.', 'mraid.resize()')"
            r12.c(r0)
            return
        Lab:
            com.beizi.ad.internal.view.f$a r12 = com.beizi.ad.internal.view.f.a.f7217b
            r0 = 45
            r1 = 95
            java.lang.String r0 = r2.replace(r0, r1)     // Catch: java.lang.IllegalArgumentException -> Lb9
            com.beizi.ad.internal.view.f$a r12 = com.beizi.ad.internal.view.f.a.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> Lb9
        Lb9:
            r9 = r12
            com.beizi.ad.internal.view.AdWebView r4 = r11.f7204b
            r4.resize(r5, r6, r7, r8, r9, r10)
            com.beizi.ad.internal.view.AdWebView r12 = r11.f7204b
            r12.c()
            com.beizi.ad.internal.view.AdWebView r12 = r11.f7204b
            java.lang.String r0 = "javascript:window.mraid.util.stateChangeEvent('resized');"
            r12.c(r0)
            r11.f7206d = r3
            return
    }

    public void a() {
            r3 = this;
            boolean r0 = r3.f7205c
            if (r0 != 0) goto L46
            boolean r0 = r3.f7206d
            if (r0 != 0) goto L46
            boolean r0 = r3.r
            if (r0 == 0) goto Ld
            goto L46
        Ld:
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            boolean r0 = r0.e()
            if (r0 == 0) goto L40
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.b()
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L3f
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L3f
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L3f
            r0.finish()
        L3f:
            return
        L40:
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            r0.d()
            return
        L46:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7204b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0.<init>(r1)
            int r1 = r3.f7208f
            r0.height = r1
            int r1 = r3.f7207e
            r0.width = r1
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r1 = r1.adViewImpl
            com.beizi.ad.internal.k r1 = r1.getMediaType()
            com.beizi.ad.internal.k r2 = com.beizi.ad.internal.k.f7002d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            int r1 = r3.f7209g
            r0.gravity = r1
            goto L72
        L6e:
            r1 = 17
            r0.gravity = r1
        L72:
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7204b
            r1.setLayoutParams(r0)
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            r0.e()
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            java.lang.String r1 = "javascript:window.mraid.util.stateChangeEvent('default');"
            r0.c(r1)
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            boolean r0 = r0.e()
            if (r0 != 0) goto L9c
            boolean r0 = r3.r
            if (r0 != 0) goto L9c
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.b()
        L9c:
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto Lb4
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto Lb4
            r1 = -1
            r0.setRequestedOrientation(r1)
        Lb4:
            r0 = 0
            r3.f7205c = r0
            r3.f7206d = r0
            r0 = 0
            r3.s = r0
            return
    }

    void a(int r2) {
            r1 = this;
            int r0 = r1.q
            if (r0 == r2) goto Lc
            r1.q = r2
            r1.f()
            r1.g()
        Lc:
            return
    }

    void a(int r9, int r10, int r11, int r12) {
            r8 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r8.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto Lb
            goto L21
        Lb:
            int[] r0 = r8.p
            r1 = 0
            r2 = r0[r1]
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 != r9) goto L22
            r2 = r0[r5]
            if (r2 != r10) goto L22
            r2 = r0[r4]
            if (r2 != r11) goto L22
            r2 = r0[r3]
            if (r2 != r12) goto L22
        L21:
            return
        L22:
            r0[r1] = r9
            r0[r5] = r10
            r0[r4] = r11
            r0[r3] = r12
            com.beizi.ad.internal.view.AdWebView r0 = r8.f7204b
            android.content.Context r0 = r0.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r2 = r0.getWindow()
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r6)
            int r2 = r2.getTop()
            int r10 = r10 - r2
            int[] r9 = new int[]{r9, r10, r11, r12}
            com.beizi.ad.internal.h.u.a(r0, r9)
            r10 = r9[r1]
            r11 = r9[r5]
            r12 = r9[r4]
            r9 = r9[r3]
            com.beizi.ad.internal.view.AdWebView r0 = r8.f7204b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r10
            r7[r5] = r11
            r7[r4] = r2
            r7[r3] = r6
            java.lang.String r10 = "javascript:window.mraid.util.setCurrentPosition(%d, %d, %d, %d)"
            java.lang.String r10 = java.lang.String.format(r10, r7)
            r0.c(r10)
            com.beizi.ad.internal.view.AdWebView r10 = r8.f7204b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r1] = r11
            r12[r5] = r9
            java.lang.String r9 = "javascript:window.mraid.util.sizeChangeEvent(%d, %d)"
            java.lang.String r9 = java.lang.String.format(r9, r12)
            r10.c(r9)
            return
    }

    public void a(android.app.Activity r1) {
            r0 = this;
            r0.n = r1
            return
    }

    void a(android.view.ViewGroup r1) {
            r0 = this;
            r0.o = r1
            return
    }

    void a(com.beizi.ad.internal.view.AdWebView r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.f7213k
            if (r0 != 0) goto Lad
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            boolean r0 = r0.d()
            if (r0 == 0) goto L11
            java.lang.String r0 = "inline"
            goto L13
        L11:
            java.lang.String r0 = "interstitial"
        L13:
            java.lang.String[] r1 = com.beizi.ad.internal.view.f.a
            com.beizi.ad.internal.view.f$b r2 = com.beizi.ad.internal.view.f.b.f7224b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            boolean r1 = r5.equals(r1)
            r3.r = r1
            com.beizi.ad.internal.view.AdWebView r2 = r3.f7204b
            r2.a = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "javascript:window.mraid.util.setPlacementType('"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "')"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.c(r1)
            boolean r1 = r3.r
            if (r1 != 0) goto L50
            r3.a(r4)
            r3.g()
            r3.f()
            r3.e()
        L50:
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7204b
            r1.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "javascript:window.mraid.util.stateChangeEvent('"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.c(r5)
            java.lang.String r5 = "javascript:window.mraid.util.readyEvent();"
            r4.c(r5)
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.width
            r3.f7207e = r4
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.height
            r3.f7208f = r4
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            com.beizi.ad.internal.view.AdViewImpl r4 = r4.adViewImpl
            com.beizi.ad.internal.k r4 = r4.getMediaType()
            com.beizi.ad.internal.k r5 = com.beizi.ad.internal.k.f7002d
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La1
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r4 = r4.gravity
            r3.f7209g = r4
        La1:
            r4 = 1
            r3.f7213k = r4
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            boolean r4 = r4.g()
            r3.a(r4)
        Lad:
            return
    }

    void a(java.lang.String r10, boolean r11) {
            r9 = this;
            java.lang.String r0 = "mraid://"
            java.lang.String r1 = ""
            java.lang.String r10 = r10.replaceFirst(r0, r1)
            java.lang.String r0 = "\\?"
            java.lang.String[] r0 = r10.split(r0)
            r2 = 0
            r3 = r0[r2]
            java.lang.String r4 = "/"
            java.lang.String r1 = r3.replaceAll(r4, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r0 = r0.length
            r4 = 1
            if (r0 <= r4) goto L64
            java.lang.String r0 = "?"
            int r0 = r10.indexOf(r0)
            int r0 = r0 + r4
            java.lang.String r10 = r10.substring(r0)
            java.lang.String r0 = "&"
            java.lang.String[] r10 = r10.split(r0)
            int r0 = r10.length
            r5 = 0
        L33:
            if (r5 >= r0) goto L64
            r6 = r10[r5]
            java.lang.String r7 = "="
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 2
            if (r7 >= r8) goto L42
            goto L61
        L42:
            r7 = r6[r4]
            boolean r7 = com.beizi.ad.internal.h.o.a(r7)
            if (r7 != 0) goto L61
            java.lang.String r7 = "undefined"
            r8 = r6[r4]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L55
            goto L61
        L55:
            android.util.Pair r7 = new android.util.Pair
            r8 = r6[r2]
            r6 = r6[r4]
            r7.<init>(r8, r6)
            r3.add(r7)
        L61:
            int r5 = r5 + 1
            goto L33
        L64:
            java.lang.String r10 = "expand"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L72
            if (r11 == 0) goto Ld7
            r9.b(r3)
            return
        L72:
            java.lang.String r10 = "close"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L7e
            r9.a()
            return
        L7e:
            java.lang.String r10 = "resize"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L8c
            if (r11 == 0) goto Ld7
            r9.h(r3)
            return
        L8c:
            java.lang.String r10 = "setOrientationProperties"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L98
            r9.g(r3)
            return
        L98:
            boolean r10 = r9.f7211i
            if (r10 == 0) goto Laa
            java.lang.String r10 = "createCalendarEvent"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Laa
            if (r11 == 0) goto Ld7
            r9.f(r3)
            return
        Laa:
            java.lang.String r10 = "playVideo"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Lb8
            if (r11 == 0) goto Ld7
            r9.e(r3)
            return
        Lb8:
            boolean r10 = r9.f7210h
            if (r10 == 0) goto Lca
            java.lang.String r10 = "storePicture"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Lca
            if (r11 == 0) goto Ld7
            r9.d(r3)
            return
        Lca:
            java.lang.String r10 = "open"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Ld8
            if (r11 == 0) goto Ld7
            r9.c(r3)
        Ld7:
            return
        Ld8:
            java.lang.String r10 = "setUseCustomClose"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Le4
            r9.a(r3)
            return
        Le4:
            java.lang.String r10 = "enable"
            r1.equals(r10)
            return
    }

    void a(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3) {
            r2 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r2.f7204b
            r1 = 0
            java.lang.Object r3 = r3.get(r1)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            r0.setMRAIDUseCustomClose(r3)
            return
    }

    void a(boolean r4) {
            r3 = this;
            boolean r0 = r3.f7213k
            if (r0 != 0) goto L5
            return
        L5:
            r3.f7212j = r4
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "javascript:window.mraid.util.setIsViewable("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.c(r4)
            return
    }

    boolean a(android.content.Intent r3) {
            r2 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r2.f7204b
            android.content.Context r0 = r0.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r3 = r0.queryIntentActivities(r3, r1)
            int r3 = r3.size()
            if (r3 <= 0) goto L17
            r3 = 1
            return r3
        L17:
            return r1
    }

    void b() {
            r2 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r2.f7204b
            boolean r0 = r0.g()
            boolean r1 = r2.f7212j
            if (r1 == r0) goto Ld
            r2.a(r0)
        Ld:
            return
    }

    void b(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r13) {
            r12 = this;
            com.beizi.ad.AdActivity$b r0 = com.beizi.ad.AdActivity.b.f6425c
            java.util.Iterator r13 = r13.iterator()
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 1
            r11 = r0
            r6 = -1
            r7 = -1
            r8 = 0
            r10 = 1
        Lf:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r13.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "w"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L33
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L31
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L31
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L31
            r6 = r0
            goto Lf
        L31:
            goto Lf
        L33:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "h"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            java.lang.Object r0 = r0.second     // Catch: java.lang.NumberFormatException -> L31
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L31
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L31
            r7 = r0
            goto Lf
        L49:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "useCustomClose"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5f
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r8 = r0
            goto Lf
        L5f:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L75
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = android.net.Uri.decode(r0)
            r3 = r0
            goto Lf
        L75:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "allow_orientation_change"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8a
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
            goto Lf
        L8a:
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "force_orientation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            com.beizi.ad.AdActivity$b r0 = r12.a(r0)
            r11 = r0
            goto Lf
        La1:
            boolean r13 = com.beizi.ad.internal.h.o.a(r3)
            if (r13 != 0) goto Lcb
            com.beizi.ad.internal.view.g r13 = new com.beizi.ad.internal.view.g     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.AdWebView r0 = r12.f7204b     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl     // Catch: java.lang.Exception -> Lc9
            r13.<init>(r0, r12)     // Catch: java.lang.Exception -> Lc9
            r12.s = r13     // Catch: java.lang.Exception -> Lc9
            r13.a(r3)     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.AdWebView r13 = r12.f7204b     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.AdViewImpl r13 = r13.adViewImpl     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.g r0 = r12.s     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.f r0 = r0.getMRAIDImplementation()     // Catch: java.lang.Exception -> Lc9
            com.beizi.ad.internal.view.f$1 r1 = new com.beizi.ad.internal.view.f$1     // Catch: java.lang.Exception -> Lc9
            r1.<init>(r12, r10, r11)     // Catch: java.lang.Exception -> Lc9
            r13.a(r0, r8, r1)     // Catch: java.lang.Exception -> Lc9
        Lc7:
            r9 = r12
            goto Ld1
        Lc9:
            goto Lc7
        Lcb:
            com.beizi.ad.internal.view.AdWebView r5 = r12.f7204b
            r9 = r12
            r5.a(r6, r7, r8, r9, r10, r11)
        Ld1:
            com.beizi.ad.internal.view.AdWebView r13 = r9.f7204b
            java.lang.String r0 = "javascript:window.mraid.util.stateChangeEvent('expanded');"
            r13.c(r0)
            r9.f7205c = r4
            com.beizi.ad.internal.view.AdWebView r13 = r9.f7204b
            com.beizi.ad.internal.view.AdViewImpl r13 = r13.adViewImpl
            boolean r13 = r13.e()
            if (r13 != 0) goto Lef
            com.beizi.ad.internal.view.AdWebView r13 = r9.f7204b
            com.beizi.ad.internal.view.AdViewImpl r13 = r13.adViewImpl
            com.beizi.ad.internal.c r13 = r13.getAdDispatcher()
            r13.c()
        Lef:
            return
    }

    android.app.Activity c() {
            r1 = this;
            android.app.Activity r0 = r1.n
            return r0
    }

    android.view.ViewGroup d() {
            r1 = this;
            android.view.ViewGroup r0 = r1.o
            return r0
    }
}

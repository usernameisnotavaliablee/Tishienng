package com.bxkj.base.v2.common.qrcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.common.qrcode.SoundUtils b;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.common.qrcode.b.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(@org.jetbrains.annotations.NotNull java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nQrCodeKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrCodeKit.kt\ncom/bxkj/base/v2/common/qrcode/QrCodeKit$startToScan$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    /* renamed from: com.bxkj.base.v2.common.qrcode.b$b, reason: collision with other inner class name */
    public static final class C0055b implements t.b.a {
        final /* synthetic */ com.bxkj.base.v2.common.qrcode.b a;

        C0055b(com.bxkj.base.v2.common.qrcode.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                if (r4 == 0) goto L30
                java.lang.String r3 = "SCAN_RESULT"
                android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                com.huawei.hms.ml.scan.HmsScan r3 = (com.huawei.hms.ml.scan.HmsScan) r3
                if (r3 == 0) goto L30
                java.lang.String r3 = r3.originalValue
                if (r3 == 0) goto L30
                int r4 = r3.length()
                if (r4 <= 0) goto L17
                goto L18
            L17:
                r3 = 0
            L18:
                if (r3 == 0) goto L30
                com.bxkj.base.v2.common.qrcode.b r4 = r2.a
                com.bxkj.base.v2.common.qrcode.SoundUtils r0 = r4.j()
                if (r0 == 0) goto L27
                int r1 = com.bxkj.base.R.raw.beep
                r0.g(r1)
            L27:
                com.bxkj.base.v2.common.qrcode.b$a r4 = r4.i()
                if (r4 == 0) goto L30
                r4.a(r3)
            L30:
                return
        }
    }

    public b(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public static /* synthetic */ kotlin.n1 a(com.bxkj.base.v2.common.qrcode.b r0) {
            kotlin.n1 r0 = l(r0)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap e(com.bxkj.base.v2.common.qrcode.b r0, java.lang.String r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            android.graphics.Bitmap r0 = r0.d(r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap g(com.bxkj.base.v2.common.qrcode.b r0, java.lang.String r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            android.graphics.Bitmap r0 = r0.f(r1, r2)
            return r0
    }

    private final void k() {
            r3 = this;
            androidx.fragment.app.FragmentActivity r0 = r3.a
            com.bxkj.base.v2.common.qrcode.a r1 = new com.bxkj.base.v2.common.qrcode.a
            r1.<init>(r3)
            java.lang.String r2 = "使用相机扫一扫功能"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            return
    }

    private static final kotlin.n1 l(com.bxkj.base.v2.common.qrcode.b r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "开始扫码"
            com.orhanobut.logger.j.d(r1, r0)
            r2.p()
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private final void p() {
            r4 = this;
            t.b r0 = new t.b
            androidx.fragment.app.FragmentActivity r1 = r4.a
            r0.<init>(r1)
            android.content.Intent r1 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r2 = r4.a
            java.lang.Class<com.huawei.hms.hmsscankit.ScanKitActivity> r3 = com.huawei.hms.hmsscankit.ScanKitActivity.class
            r1.<init>(r2, r3)
            java.lang.String r2 = "ScanFormatValue"
            int r3 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "ScanGuide"
            r3 = 1
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "ScanViewValue"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "putExtra(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            t.b r0 = r0.startActivityForResult(r1)
            com.bxkj.base.v2.common.qrcode.b$b r1 = new com.bxkj.base.v2.common.qrcode.b$b
            r1.<init>(r4)
            r0.c(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap b(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE     // Catch: java.lang.Exception -> L1d
            androidx.fragment.app.FragmentActivity r2 = r5.a     // Catch: java.lang.Exception -> L1d
            r3 = 1134559232(0x43a00000, float:320.0)
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)     // Catch: java.lang.Exception -> L1d
            androidx.fragment.app.FragmentActivity r3 = r5.a     // Catch: java.lang.Exception -> L1d
            r4 = 1117782016(0x42a00000, float:80.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r4, r3)     // Catch: java.lang.Exception -> L1d
            android.graphics.Bitmap r6 = com.huawei.hms.hmsscankit.ScanUtil.buildBitmap(r6, r1, r2, r3, r0)     // Catch: java.lang.Exception -> L1d
            return r6
        L1d:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r1 = "生成条形码失败"
            com.orhanobut.logger.j.e(r1, r6)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap c(@org.jetbrains.annotations.NotNull java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE     // Catch: java.lang.Exception -> L36
            androidx.fragment.app.FragmentActivity r2 = r11.a     // Catch: java.lang.Exception -> L36
            r3 = 1143930880(0x442f0000, float:700.0)
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)     // Catch: java.lang.Exception -> L36
            androidx.fragment.app.FragmentActivity r3 = r11.a     // Catch: java.lang.Exception -> L36
            r4 = 1125515264(0x43160000, float:150.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r4, r3)     // Catch: java.lang.Exception -> L36
            android.graphics.Bitmap r4 = com.huawei.hms.hmsscankit.ScanUtil.buildBitmap(r12, r1, r2, r3, r0)     // Catch: java.lang.Exception -> L36
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch: java.lang.Exception -> L36
            r9.<init>()     // Catch: java.lang.Exception -> L36
            r12 = 1119092736(0x42b40000, float:90.0)
            r9.postRotate(r12)     // Catch: java.lang.Exception -> L36
            int r7 = r4.getWidth()     // Catch: java.lang.Exception -> L36
            int r8 = r4.getHeight()     // Catch: java.lang.Exception -> L36
            r10 = 1
            r5 = 0
            r6 = 0
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L36
            return r12
        L36:
            r12 = 0
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r1 = "生成条形码失败"
            com.orhanobut.logger.j.e(r1, r12)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap d(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.Integer r6) {
            r4 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r6 == 0) goto L23
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r0 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r1 = r4.a     // Catch: java.lang.Exception -> L41
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L41
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r1, r6)     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r6 = r0.setQRLogoBitmap(r6)     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r6 = r6.create()     // Catch: java.lang.Exception -> L41
            goto L2c
        L23:
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r6 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator     // Catch: java.lang.Exception -> L41
            r6.<init>()     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r6 = r6.create()     // Catch: java.lang.Exception -> L41
        L2c:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r1 = r4.a     // Catch: java.lang.Exception -> L41
            r2 = 1132593152(0x43820000, float:260.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r3 = r4.a     // Catch: java.lang.Exception -> L41
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap r5 = com.huawei.hms.hmsscankit.ScanUtil.buildBitmap(r5, r0, r1, r2, r6)     // Catch: java.lang.Exception -> L41
            return r5
        L41:
            androidx.fragment.app.FragmentActivity r5 = r4.a
            java.lang.String r6 = "生成二维码失败"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r5, r6)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.orhanobut.logger.j.e(r6, r5)
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap f(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.Integer r6) {
            r4 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r6 == 0) goto L23
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r0 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r1 = r4.a     // Catch: java.lang.Exception -> L41
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L41
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r1, r6)     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r6 = r0.setQRLogoBitmap(r6)     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r6 = r6.create()     // Catch: java.lang.Exception -> L41
            goto L2c
        L23:
            com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator r6 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$Creator     // Catch: java.lang.Exception -> L41
            r6.<init>()     // Catch: java.lang.Exception -> L41
            com.huawei.hms.ml.scan.HmsBuildBitmapOption r6 = r6.create()     // Catch: java.lang.Exception -> L41
        L2c:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r1 = r4.a     // Catch: java.lang.Exception -> L41
            r2 = 1134559232(0x43a00000, float:320.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)     // Catch: java.lang.Exception -> L41
            androidx.fragment.app.FragmentActivity r3 = r4.a     // Catch: java.lang.Exception -> L41
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap r5 = com.huawei.hms.hmsscankit.ScanUtil.buildBitmap(r5, r0, r1, r2, r6)     // Catch: java.lang.Exception -> L41
            return r5
        L41:
            androidx.fragment.app.FragmentActivity r5 = r4.a
            java.lang.String r6 = "生成二维码失败"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r5, r6)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.orhanobut.logger.j.e(r6, r5)
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentActivity h() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.common.qrcode.b.a i() {
            r1 = this;
            com.bxkj.base.v2.common.qrcode.b$a r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.common.qrcode.SoundUtils j() {
            r1 = this;
            com.bxkj.base.v2.common.qrcode.SoundUtils r0 = r1.b
            return r0
    }

    public final void m(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.common.qrcode.b.a r3) {
            r2 = this;
            java.lang.String r0 = "resultCallback"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bxkj.base.v2.common.qrcode.SoundUtils r0 = new com.bxkj.base.v2.common.qrcode.SoundUtils
            androidx.fragment.app.FragmentActivity r1 = r2.a
            r0.<init>(r1)
            r2.b = r0
            int r1 = com.bxkj.base.R.raw.beep
            r0.m(r1)
            r2.c = r3
            r2.k()
            return
    }

    public final void n(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.common.qrcode.b.a r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public final void o(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.common.qrcode.SoundUtils r1) {
            r0 = this;
            r0.b = r1
            return
    }
}

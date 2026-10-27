package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class h1 extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__WIN_PRICE__")
    private final java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__HIGHEST_LOSS_PRICE__")
    private final java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__LOSS_REASON__")
    private final java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ADN_ID__")
    private final java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EXPECT_PRICE__")
    private final java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__PRICE__")
    private final java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SRC_PRICE__")
    private final java.lang.String g;

    public h1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.g = r1
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.AesUtil.encryptCFB(r1)
            r0.f = r1
            return
    }
}

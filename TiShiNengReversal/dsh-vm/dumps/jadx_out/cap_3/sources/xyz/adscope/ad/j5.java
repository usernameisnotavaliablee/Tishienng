package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j5 extends xyz.adscope.ad.t {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lat")
    private float a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lon")
    private float b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ext")
    private xyz.adscope.ad.o1 c;

    public j5(@androidx.annotation.NonNull xyz.adscope.common.v2.location.ILocation r4) {
            r3 = this;
            r3.<init>()
            double r0 = r4.getLatitude()
            float r0 = (float) r0
            r3.a = r0
            double r0 = r4.getLongitude()
            float r0 = (float) r0
            r3.b = r0
            xyz.adscope.ad.o1 r0 = new xyz.adscope.ad.o1
            long r1 = r4.getLocationTimestamp()
            xyz.adscope.common.v2.location.ILocation$CoordinateType r4 = r4.getCoordinateType()
            java.lang.String r4 = r4.getType()
            r0.<init>(r1, r4)
            r3.c = r0
            return
    }
}

package xyz.adscope.ad.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IASNPCustomController {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum UnderageTag extends java.lang.Enum<xyz.adscope.ad.publish.IASNPCustomController.UnderageTag> {
        public static final xyz.adscope.ad.publish.IASNPCustomController.UnderageTag ADULT = null;
        public static final xyz.adscope.ad.publish.IASNPCustomController.UnderageTag UNDERAGE = null;
        public static final xyz.adscope.ad.publish.IASNPCustomController.UnderageTag UNKNOWN = null;
        private static final /* synthetic */ xyz.adscope.ad.publish.IASNPCustomController.UnderageTag[] b = null;
        private final int a;

        static {
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = new xyz.adscope.ad.publish.IASNPCustomController$UnderageTag
                r1 = -1
                java.lang.String r2 = "UNKNOWN"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.UNKNOWN = r0
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = new xyz.adscope.ad.publish.IASNPCustomController$UnderageTag
                java.lang.String r1 = "ADULT"
                r2 = 1
                r0.<init>(r1, r2, r3)
                xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.ADULT = r0
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = new xyz.adscope.ad.publish.IASNPCustomController$UnderageTag
                java.lang.String r1 = "UNDERAGE"
                r3 = 2
                r0.<init>(r1, r3, r2)
                xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.UNDERAGE = r0
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag[] r0 = a()
                xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.b = r0
                return
        }

        UnderageTag(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        private static /* synthetic */ xyz.adscope.ad.publish.IASNPCustomController.UnderageTag[] a() {
                r0 = 3
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag[] r0 = new xyz.adscope.ad.publish.IASNPCustomController.UnderageTag[r0]
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r1 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.UNKNOWN
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r1 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.ADULT
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r1 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.UNDERAGE
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.publish.IASNPCustomController.UnderageTag valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.publish.IASNPCustomController$UnderageTag> r0 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r1 = (xyz.adscope.ad.publish.IASNPCustomController.UnderageTag) r1
                return r1
        }

        public static xyz.adscope.ad.publish.IASNPCustomController.UnderageTag[] values() {
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag[] r0 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.b
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.publish.IASNPCustomController$UnderageTag[] r0 = (xyz.adscope.ad.publish.IASNPCustomController.UnderageTag[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    public IASNPCustomController() {
            r0 = this;
            r0.<init>()
            return
    }

    public xyz.adscope.ad.publish.loc.ASNPLocation getASNPLocation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getGAID() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getOAID() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public xyz.adscope.ad.publish.IASNPCustomController.UnderageTag getUnderageTag() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = xyz.adscope.ad.publish.IASNPCustomController.UnderageTag.UNKNOWN
            return r0
    }

    public boolean isCanGatherOAID() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isCanUpdateLocation() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isCanUseSensor() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isSupportPersonalized() {
            r1 = this;
            r0 = 1
            return r0
    }
}

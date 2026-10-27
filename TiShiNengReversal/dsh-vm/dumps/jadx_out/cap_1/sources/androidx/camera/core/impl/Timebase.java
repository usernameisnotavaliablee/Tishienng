package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public enum Timebase extends java.lang.Enum<androidx.camera.core.impl.Timebase> {
    private static final /* synthetic */ androidx.camera.core.impl.Timebase[] $VALUES = null;
    public static final androidx.camera.core.impl.Timebase REALTIME = null;
    public static final androidx.camera.core.impl.Timebase UPTIME = null;

    private static /* synthetic */ androidx.camera.core.impl.Timebase[] $values() {
            r0 = 2
            androidx.camera.core.impl.Timebase[] r0 = new androidx.camera.core.impl.Timebase[r0]
            androidx.camera.core.impl.Timebase r1 = androidx.camera.core.impl.Timebase.UPTIME
            r2 = 0
            r0[r2] = r1
            androidx.camera.core.impl.Timebase r1 = androidx.camera.core.impl.Timebase.REALTIME
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            androidx.camera.core.impl.Timebase r0 = new androidx.camera.core.impl.Timebase
            java.lang.String r1 = "UPTIME"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.camera.core.impl.Timebase.UPTIME = r0
            androidx.camera.core.impl.Timebase r0 = new androidx.camera.core.impl.Timebase
            java.lang.String r1 = "REALTIME"
            r2 = 1
            r0.<init>(r1, r2)
            androidx.camera.core.impl.Timebase.REALTIME = r0
            androidx.camera.core.impl.Timebase[] r0 = $values()
            androidx.camera.core.impl.Timebase.$VALUES = r0
            return
    }

    Timebase(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.camera.core.impl.Timebase valueOf(java.lang.String r1) {
            java.lang.Class<androidx.camera.core.impl.Timebase> r0 = androidx.camera.core.impl.Timebase.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.camera.core.impl.Timebase r1 = (androidx.camera.core.impl.Timebase) r1
            return r1
    }

    public static androidx.camera.core.impl.Timebase[] values() {
            androidx.camera.core.impl.Timebase[] r0 = androidx.camera.core.impl.Timebase.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.camera.core.impl.Timebase[] r0 = (androidx.camera.core.impl.Timebase[]) r0
            return r0
    }
}

package com.jmolsmobile.landscapevideocapture.configuration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CaptureConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration> CREATOR = null;
    public static final int n = 1048576;
    public static final int o = 1000;
    public static final int p = -1;
    public static final int q = -1;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration a(android.os.Parcel r3) {
                r2 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration[] b(int r1) {
                r0 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration[] r1 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration[] newArray(int r1) {
                r0 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration[] r1 = r0.b(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private final com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration a;

        public b(int r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration
                r1 = 0
                r0.<init>(r1)
                r2.a = r0
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.a(r0, r3)
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b(r0, r4)
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.c(r0, r5)
                return
        }

        public b(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r3, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r4) {
                r2 = this;
                r2.<init>()
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration
                r1 = 0
                r0.<init>(r1)
                r2.a = r0
                int r1 = r3.width
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.a(r0, r1)
                int r1 = r3.height
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b(r0, r1)
                int r3 = r3.getBitrate(r4)
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.c(r0, r3)
                return
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration a() {
                r1 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r1.a
                return r0
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b b(int r2) {
                r1 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r1.a
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.f(r0, r2)
                return r1
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b c(int r2) {
                r1 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r1.a
                int r2 = r2 * 1000
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.d(r0, r2)
                return r1
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b d(int r3) {
                r2 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r2.a
                r1 = 1048576(0x100000, float:1.469368E-39)
                int r3 = r3 * r1
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.e(r0, r3)
                return r2
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b e() {
                r2 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r2.a
                r1 = 0
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.h(r0, r1)
                return r2
        }

        public com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.b f() {
                r2 = this;
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r2.a
                r1 = 1
                com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.g(r0, r1)
                return r2
        }
    }

    static {
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration$a r0 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration$a
            r0.<init>()
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.CREATOR = r0
            return
    }

    private CaptureConfiguration() {
            r3 = this;
            r3.<init>()
            r0 = 1280(0x500, float:1.794E-42)
            r3.a = r0
            r0 = 720(0x2d0, float:1.009E-42)
            r3.b = r0
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            r3.c = r0
            r0 = -1
            r3.d = r0
            r3.e = r0
            r0 = 0
            r3.f = r0
            r1 = 1
            r3.g = r1
            r2 = 30
            r3.h = r2
            r2 = 2
            r3.i = r2
            r3.j = r0
            r0 = 3
            r3.k = r0
            r3.l = r1
            r3.m = r2
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.d = r0
            r3.e = r0
            r0 = 0
            r3.f = r0
            r1 = 1
            r3.g = r1
            r2 = 30
            r3.h = r2
            r2 = 2
            r3.i = r2
            r3.j = r0
            r0 = 3
            r3.k = r0
            r3.l = r1
            r3.m = r2
            r3.a = r4
            r3.b = r5
            r3.c = r6
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            int r4 = r4 * 1000
            r0.d = r4
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r5 = r5 * r1
            r0.e = r5
            return
    }

    private CaptureConfiguration(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            r0 = 1280(0x500, float:1.794E-42)
            r4.a = r0
            r0 = 720(0x2d0, float:1.009E-42)
            r4.b = r0
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            r4.c = r0
            r0 = -1
            r4.d = r0
            r4.e = r0
            r0 = 0
            r4.f = r0
            r1 = 1
            r4.g = r1
            r2 = 30
            r4.h = r2
            r2 = 2
            r4.i = r2
            r4.j = r0
            r3 = 3
            r4.k = r3
            r4.l = r1
            r4.m = r2
            int r2 = r5.readInt()
            r4.a = r2
            int r2 = r5.readInt()
            r4.b = r2
            int r2 = r5.readInt()
            r4.c = r2
            int r2 = r5.readInt()
            r4.d = r2
            int r2 = r5.readInt()
            r4.e = r2
            int r2 = r5.readInt()
            r4.h = r2
            byte r2 = r5.readByte()
            if (r2 == 0) goto L57
            r2 = 1
            goto L58
        L57:
            r2 = 0
        L58:
            r4.f = r2
            byte r2 = r5.readByte()
            if (r2 == 0) goto L61
            r0 = 1
        L61:
            r4.g = r0
            int r0 = r5.readInt()
            r4.i = r0
            int r0 = r5.readInt()
            r4.j = r0
            int r0 = r5.readInt()
            r4.k = r0
            int r0 = r5.readInt()
            r4.l = r0
            int r5 = r5.readInt()
            r4.m = r5
            return
    }

    /* synthetic */ CaptureConfiguration(android.os.Parcel r1, com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r4, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r5) {
            r3 = this;
            r3.<init>()
            r0 = 1280(0x500, float:1.794E-42)
            r3.a = r0
            r0 = 720(0x2d0, float:1.009E-42)
            r3.b = r0
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            r3.c = r0
            r0 = -1
            r3.d = r0
            r3.e = r0
            r0 = 0
            r3.f = r0
            r1 = 1
            r3.g = r1
            r2 = 30
            r3.h = r2
            r2 = 2
            r3.i = r2
            r3.j = r0
            r0 = 3
            r3.k = r0
            r3.l = r1
            r3.m = r2
            int r0 = r4.width
            r3.a = r0
            int r0 = r4.height
            r3.b = r0
            int r4 = r4.getBitrate(r5)
            r3.c = r4
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r1, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            int r3 = r3 * 1000
            r0.d = r3
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r4 = r4 * r1
            r0.e = r4
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r8, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r9, int r10, int r11, boolean r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.f = r5
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r1, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r2, int r3, int r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f = r5
            r0.g = r6
            return
    }

    @java.lang.Deprecated
    public CaptureConfiguration(com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution r1, com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality r2, int r3, int r4, boolean r5, boolean r6, int r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r0
            r1.h = r7
            return
    }

    static /* synthetic */ int a(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.a = r1
            return r1
    }

    static /* synthetic */ int b(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.b = r1
            return r1
    }

    static /* synthetic */ int c(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ int d(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.d = r1
            return r1
    }

    static /* synthetic */ int e(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.e = r1
            return r1
    }

    static /* synthetic */ int f(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, int r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ boolean g(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, boolean r1) {
            r0.f = r1
            return r1
    }

    static /* synthetic */ boolean h(com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0, boolean r1) {
            r0.g = r1
            return r1
    }

    public static com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration n() {
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration
            r0.<init>()
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public int k() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public int l() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public int o() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int p() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int q() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public boolean s() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public int t() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int u() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public int v() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public int w() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            int r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.d
            r1.writeInt(r2)
            int r2 = r0.e
            r1.writeInt(r2)
            int r2 = r0.h
            r1.writeInt(r2)
            boolean r2 = r0.f
            byte r2 = (byte) r2
            r1.writeByte(r2)
            boolean r2 = r0.g
            byte r2 = (byte) r2
            r1.writeByte(r2)
            int r2 = r0.i
            r1.writeInt(r2)
            int r2 = r0.j
            r1.writeInt(r2)
            int r2 = r0.k
            r1.writeInt(r2)
            int r2 = r0.l
            r1.writeInt(r2)
            int r2 = r0.m
            r1.writeInt(r2)
            return
    }

    public int x() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int y() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}

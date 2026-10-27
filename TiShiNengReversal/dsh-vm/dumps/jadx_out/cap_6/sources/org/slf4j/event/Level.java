package org.slf4j.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum Level extends java.lang.Enum<org.slf4j.event.Level> {
    private static final /* synthetic */ org.slf4j.event.Level[] $VALUES = null;
    public static final org.slf4j.event.Level DEBUG = null;
    public static final org.slf4j.event.Level ERROR = null;
    public static final org.slf4j.event.Level INFO = null;
    public static final org.slf4j.event.Level TRACE = null;
    public static final org.slf4j.event.Level WARN = null;
    private int levelInt;
    private java.lang.String levelStr;

    static {
            org.slf4j.event.Level r0 = new org.slf4j.event.Level
            r1 = 40
            java.lang.String r2 = "ERROR"
            r3 = 0
            r0.<init>(r2, r3, r1, r2)
            org.slf4j.event.Level.ERROR = r0
            org.slf4j.event.Level r1 = new org.slf4j.event.Level
            r2 = 30
            java.lang.String r4 = "WARN"
            r5 = 1
            r1.<init>(r4, r5, r2, r4)
            org.slf4j.event.Level.WARN = r1
            org.slf4j.event.Level r2 = new org.slf4j.event.Level
            r4 = 20
            java.lang.String r6 = "INFO"
            r7 = 2
            r2.<init>(r6, r7, r4, r6)
            org.slf4j.event.Level.INFO = r2
            org.slf4j.event.Level r4 = new org.slf4j.event.Level
            r6 = 10
            java.lang.String r8 = "DEBUG"
            r9 = 3
            r4.<init>(r8, r9, r6, r8)
            org.slf4j.event.Level.DEBUG = r4
            org.slf4j.event.Level r6 = new org.slf4j.event.Level
            java.lang.String r8 = "TRACE"
            r10 = 4
            r6.<init>(r8, r10, r3, r8)
            org.slf4j.event.Level.TRACE = r6
            r8 = 5
            org.slf4j.event.Level[] r8 = new org.slf4j.event.Level[r8]
            r8[r3] = r0
            r8[r5] = r1
            r8[r7] = r2
            r8[r9] = r4
            r8[r10] = r6
            org.slf4j.event.Level.$VALUES = r8
            return
    }

    Level(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.levelInt = r3
            r0.levelStr = r4
            return
    }

    public static org.slf4j.event.Level valueOf(java.lang.String r1) {
            java.lang.Class<org.slf4j.event.Level> r0 = org.slf4j.event.Level.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.slf4j.event.Level r1 = (org.slf4j.event.Level) r1
            return r1
    }

    public static org.slf4j.event.Level[] values() {
            org.slf4j.event.Level[] r0 = org.slf4j.event.Level.$VALUES
            java.lang.Object r0 = r0.clone()
            org.slf4j.event.Level[] r0 = (org.slf4j.event.Level[]) r0
            return r0
    }

    public int toInt() {
            r1 = this;
            int r0 = r1.levelInt
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.levelStr
            return r0
    }
}

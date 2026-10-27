package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Emitter<T> extends rx.f<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BackpressureMode extends java.lang.Enum<rx.Emitter.BackpressureMode> {
        private static final /* synthetic */ rx.Emitter.BackpressureMode[] $VALUES = null;
        public static final rx.Emitter.BackpressureMode BUFFER = null;
        public static final rx.Emitter.BackpressureMode DROP = null;
        public static final rx.Emitter.BackpressureMode ERROR = null;
        public static final rx.Emitter.BackpressureMode LATEST = null;
        public static final rx.Emitter.BackpressureMode NONE = null;

        static {
                rx.Emitter$BackpressureMode r0 = new rx.Emitter$BackpressureMode
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                rx.Emitter.BackpressureMode.NONE = r0
                rx.Emitter$BackpressureMode r1 = new rx.Emitter$BackpressureMode
                java.lang.String r3 = "ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                rx.Emitter.BackpressureMode.ERROR = r1
                rx.Emitter$BackpressureMode r3 = new rx.Emitter$BackpressureMode
                java.lang.String r5 = "BUFFER"
                r6 = 2
                r3.<init>(r5, r6)
                rx.Emitter.BackpressureMode.BUFFER = r3
                rx.Emitter$BackpressureMode r5 = new rx.Emitter$BackpressureMode
                java.lang.String r7 = "DROP"
                r8 = 3
                r5.<init>(r7, r8)
                rx.Emitter.BackpressureMode.DROP = r5
                rx.Emitter$BackpressureMode r7 = new rx.Emitter$BackpressureMode
                java.lang.String r9 = "LATEST"
                r10 = 4
                r7.<init>(r9, r10)
                rx.Emitter.BackpressureMode.LATEST = r7
                r9 = 5
                rx.Emitter$BackpressureMode[] r9 = new rx.Emitter.BackpressureMode[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                rx.Emitter.BackpressureMode.$VALUES = r9
                return
        }

        BackpressureMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static rx.Emitter.BackpressureMode valueOf(java.lang.String r1) {
                java.lang.Class<rx.Emitter$BackpressureMode> r0 = rx.Emitter.BackpressureMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                rx.Emitter$BackpressureMode r1 = (rx.Emitter.BackpressureMode) r1
                return r1
        }

        public static rx.Emitter.BackpressureMode[] values() {
                rx.Emitter$BackpressureMode[] r0 = rx.Emitter.BackpressureMode.$VALUES
                java.lang.Object r0 = r0.clone()
                rx.Emitter$BackpressureMode[] r0 = (rx.Emitter.BackpressureMode[]) r0
                return r0
        }
    }

    void a(rx.functions.n r1);

    void b(rx.m r1);

    long requested();
}

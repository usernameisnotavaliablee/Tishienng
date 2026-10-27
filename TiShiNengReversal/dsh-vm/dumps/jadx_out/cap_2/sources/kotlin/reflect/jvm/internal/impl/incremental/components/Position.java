package kotlin.reflect.jvm.internal.impl.incremental.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Position implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.Position.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.incremental.components.Position NO_POSITION = null;
    private final int column;
    private final int line;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.incremental.components.Position a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = kotlin.reflect.jvm.internal.impl.incremental.components.Position.access$getNO_POSITION$cp()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.incremental.components.Position$a r0 = new kotlin.reflect.jvm.internal.impl.incremental.components.Position$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion = r0
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = new kotlin.reflect.jvm.internal.impl.incremental.components.Position
            r1 = -1
            r0.<init>(r1, r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.Position.NO_POSITION = r0
            return
    }

    public Position(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.line = r1
            r0.column = r2
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.incremental.components.Position access$getNO_POSITION$cp() {
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = kotlin.reflect.jvm.internal.impl.incremental.components.Position.NO_POSITION
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.incremental.components.Position
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r5 = (kotlin.reflect.jvm.internal.impl.incremental.components.Position) r5
            int r1 = r4.line
            int r3 = r5.line
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.column
            int r5 = r5.column
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.line
            int r0 = r0 * 31
            int r1 = r2.column
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Position(line="
            r0.append(r1)
            int r1 = r2.line
            r0.append(r1)
            java.lang.String r1 = ", column="
            r0.append(r1)
            int r1 = r2.column
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

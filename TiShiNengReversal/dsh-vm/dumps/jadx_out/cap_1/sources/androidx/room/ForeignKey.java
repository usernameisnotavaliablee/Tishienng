package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({})
@kotlin.annotation.Target(allowedTargets = {})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface ForeignKey {
    public static final int CASCADE = 5;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.ForeignKey.Companion Companion = null;
    public static final int NO_ACTION = 1;
    public static final int RESTRICT = 2;
    public static final int SET_DEFAULT = 4;
    public static final int SET_NULL = 3;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface Action {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ androidx.room.ForeignKey.Companion $$INSTANCE = null;
        public static final int CASCADE = 5;
        public static final int NO_ACTION = 1;
        public static final int RESTRICT = 2;
        public static final int SET_DEFAULT = 4;
        public static final int SET_NULL = 3;

        static {
                androidx.room.ForeignKey$Companion r0 = new androidx.room.ForeignKey$Companion
                r0.<init>()
                androidx.room.ForeignKey.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.room.ForeignKey$Companion r0 = androidx.room.ForeignKey.Companion.$$INSTANCE
            androidx.room.ForeignKey.Companion = r0
            return
    }

    java.lang.String[] childColumns();

    boolean deferred() default false;

    java.lang.Class<?> entity();

    @androidx.room.ForeignKey.Action
    int onDelete() default 1;

    @androidx.room.ForeignKey.Action
    int onUpdate() default 1;

    java.lang.String[] parentColumns();
}

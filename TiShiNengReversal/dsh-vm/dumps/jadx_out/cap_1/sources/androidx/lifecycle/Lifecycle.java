package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Lifecycle {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    private java.util.concurrent.atomic.AtomicReference<java.lang.Object> internalScopeRef;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Event extends java.lang.Enum<androidx.lifecycle.Lifecycle.Event> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $VALUES = null;

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.Lifecycle.Event.Companion Companion = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_ANY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_CREATE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_DESTROY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_PAUSE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_RESUME = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_START = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_STOP = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                static {
                        androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L10
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                        r2 = 1
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                    L10:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L19
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                        r2 = 2
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                    L19:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L22
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                        r2 = 3
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                    L22:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L2b
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                        r2 = 4
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                    L2b:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L34
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                        r2 = 5
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                    L34:
                        androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                        return
                }
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final androidx.lifecycle.Lifecycle.Event downFrom(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r2 = r2.ordinal()
                    r2 = r0[r2]
                    r0 = 1
                    if (r2 == r0) goto L1e
                    r0 = 2
                    if (r2 == r0) goto L1b
                    r0 = 3
                    if (r2 == r0) goto L18
                    r2 = 0
                    return r2
                L18:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                    return r2
                L1b:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                    return r2
                L1e:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final androidx.lifecycle.Lifecycle.Event downTo(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r2 = r2.ordinal()
                    r2 = r0[r2]
                    r0 = 1
                    if (r2 == r0) goto L1e
                    r0 = 2
                    if (r2 == r0) goto L1b
                    r0 = 4
                    if (r2 == r0) goto L18
                    r2 = 0
                    return r2
                L18:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                    return r2
                L1b:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                    return r2
                L1e:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final androidx.lifecycle.Lifecycle.Event upFrom(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r2 = r2.ordinal()
                    r2 = r0[r2]
                    r0 = 1
                    if (r2 == r0) goto L1e
                    r0 = 2
                    if (r2 == r0) goto L1b
                    r0 = 5
                    if (r2 == r0) goto L18
                    r2 = 0
                    return r2
                L18:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                    return r2
                L1b:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                    return r2
                L1e:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.Nullable
            public final androidx.lifecycle.Lifecycle.Event upTo(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r2 = r2.ordinal()
                    r2 = r0[r2]
                    r0 = 1
                    if (r2 == r0) goto L1e
                    r0 = 2
                    if (r2 == r0) goto L1b
                    r0 = 3
                    if (r2 == r0) goto L18
                    r2 = 0
                    return r2
                L18:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                    return r2
                L1b:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                    return r2
                L1e:
                    androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                L3d:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L46
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
                L46:
                    androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $values() {
                r0 = 7
                androidx.lifecycle.Lifecycle$Event[] r0 = new androidx.lifecycle.Lifecycle.Event[r0]
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                r2 = 0
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                r2 = 1
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                r2 = 2
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                r2 = 3
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                r2 = 4
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                r2 = 5
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                r2 = 6
                r0[r2] = r1
                return r0
        }

        static {
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_CREATE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_START"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_START = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_RESUME"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_RESUME = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_PAUSE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_PAUSE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_STOP"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_STOP = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_DESTROY"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_DESTROY = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_ANY"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_ANY = r0
                androidx.lifecycle.Lifecycle$Event[] r0 = $values()
                androidx.lifecycle.Lifecycle.Event.$VALUES = r0
                androidx.lifecycle.Lifecycle$Event$Companion r0 = new androidx.lifecycle.Lifecycle$Event$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.Lifecycle.Event.Companion = r0
                return
        }

        Event(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final androidx.lifecycle.Lifecycle.Event downFrom(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r1 = r0.downFrom(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final androidx.lifecycle.Lifecycle.Event downTo(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r1 = r0.downTo(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final androidx.lifecycle.Lifecycle.Event upFrom(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r1 = r0.upFrom(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public static final androidx.lifecycle.Lifecycle.Event upTo(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r1 = r0.upTo(r1)
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$Event> r0 = androidx.lifecycle.Lifecycle.Event.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$Event r1 = (androidx.lifecycle.Lifecycle.Event) r1
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event[] values() {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$Event[] r0 = (androidx.lifecycle.Lifecycle.Event[]) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.Lifecycle.State getTargetState() {
                r3 = this;
                int[] r0 = androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2b;
                    case 2: goto L2b;
                    case 3: goto L28;
                    case 4: goto L28;
                    case 5: goto L25;
                    case 6: goto L22;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = " has no target state"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L22:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                return r0
            L25:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                return r0
            L28:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
                return r0
            L2b:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum State extends java.lang.Enum<androidx.lifecycle.Lifecycle.State> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.State CREATED = null;
        public static final androidx.lifecycle.Lifecycle.State DESTROYED = null;
        public static final androidx.lifecycle.Lifecycle.State INITIALIZED = null;
        public static final androidx.lifecycle.Lifecycle.State RESUMED = null;
        public static final androidx.lifecycle.Lifecycle.State STARTED = null;

        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $values() {
                r0 = 5
                androidx.lifecycle.Lifecycle$State[] r0 = new androidx.lifecycle.Lifecycle.State[r0]
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                r2 = 0
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
                r2 = 1
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
                r2 = 2
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
                r2 = 3
                r0[r2] = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.DESTROYED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.INITIALIZED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "CREATED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.CREATED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "STARTED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.STARTED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "RESUMED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.RESUMED = r0
                androidx.lifecycle.Lifecycle$State[] r0 = $values()
                androidx.lifecycle.Lifecycle.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$State> r0 = androidx.lifecycle.Lifecycle.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$State r1 = (androidx.lifecycle.Lifecycle.State) r1
                return r1
        }

        public static androidx.lifecycle.Lifecycle.State[] values() {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$State[] r0 = (androidx.lifecycle.Lifecycle.State[]) r0
                return r0
        }

        public final boolean isAtLeast(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                java.lang.String r0 = "state"
                kotlin.jvm.internal.g0.p(r2, r0)
                int r2 = r1.compareTo(r2)
                if (r2 < 0) goto Ld
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }
    }

    public Lifecycle() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.internalScopeRef = r0
            return
    }

    @androidx.annotation.MainThread
    public abstract void addObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleObserver r1);

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getInternalScopeRef() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.internalScopeRef
            return r0
    }

    @androidx.annotation.MainThread
    public abstract void removeObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleObserver r1);

    public final void setInternalScopeRef(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.internalScopeRef = r2
            return
    }
}

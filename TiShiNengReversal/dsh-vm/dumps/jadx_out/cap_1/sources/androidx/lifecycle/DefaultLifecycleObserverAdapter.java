package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DefaultLifecycleObserverAdapter implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver;

    @org.jetbrains.annotations.Nullable
    private final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver;

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
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L34
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
                androidx.lifecycle.DefaultLifecycleObserverAdapter.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DefaultLifecycleObserverAdapter(@org.jetbrains.annotations.NotNull androidx.lifecycle.DefaultLifecycleObserver r2, @org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleEventObserver r3) {
            r1 = this;
            java.lang.String r0 = "defaultLifecycleObserver"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.defaultLifecycleObserver = r2
            r1.lifecycleEventObserver = r3
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = androidx.lifecycle.DefaultLifecycleObserverAdapter.WhenMappings.$EnumSwitchMapping$0
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L36;
                case 3: goto L30;
                case 4: goto L2a;
                case 5: goto L24;
                case 6: goto L1e;
                case 7: goto L16;
                default: goto L15;
            }
        L15:
            goto L41
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ON_ANY must not been send by anybody"
            r3.<init>(r4)
            throw r3
        L1e:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onDestroy(r3)
            goto L41
        L24:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onStop(r3)
            goto L41
        L2a:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onPause(r3)
            goto L41
        L30:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onResume(r3)
            goto L41
        L36:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onStart(r3)
            goto L41
        L3c:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onCreate(r3)
        L41:
            androidx.lifecycle.LifecycleEventObserver r0 = r2.lifecycleEventObserver
            if (r0 == 0) goto L48
            r0.onStateChanged(r3, r4)
        L48:
            return
    }
}

package com.huawei.hms.feature.dynamic;

import com.huawei.hms.feature.dynamic.LifecycleDelegate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class DeferredLifecycleHelper<T extends com.huawei.hms.feature.dynamic.LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;
    public static final java.lang.String e = "DeferredLifecycleHelper";
    public T a;
    public android.os.Bundle b;
    public java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g> c;
    public com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<T> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<T> {
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper a;

        public a(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public void onDelegateCreated(T r3) {
                r2 = this;
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0 = r2.a
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a(r0, r3)
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r3 = r2.a
                java.util.LinkedList r3 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.b(r3)
                java.util.Iterator r3 = r3.iterator()
            Lf:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L25
                java.lang.Object r0 = r3.next()
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g r0 = (com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g) r0
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1 = r2.a
                com.huawei.hms.feature.dynamic.LifecycleDelegate r1 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a(r1)
                r0.a(r1)
                goto Lf
            L25:
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r3 = r2.a
                java.util.LinkedList r3 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.b(r3)
                r3.clear()
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r3 = r2.a
                r0 = 0
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g {
        public final /* synthetic */ android.app.Activity a;
        public final /* synthetic */ android.os.Bundle b;
        public final /* synthetic */ android.os.Bundle c;
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper d;

        public b(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1, android.app.Activity r2, android.os.Bundle r3, android.os.Bundle r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r4) {
                r3 = this;
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r4 = r3.d
                com.huawei.hms.feature.dynamic.LifecycleDelegate r4 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a(r4)
                android.app.Activity r0 = r3.a
                android.os.Bundle r1 = r3.b
                android.os.Bundle r2 = r3.c
                r4.onInflate(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g {
        public final /* synthetic */ android.os.Bundle a;
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper b;

        public c(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1, android.os.Bundle r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r2) {
                r1 = this;
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a()
                android.os.Bundle r0 = r1.a
                r2.onCreate(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g {
        public final /* synthetic */ android.widget.FrameLayout a;
        public final /* synthetic */ android.view.LayoutInflater b;
        public final /* synthetic */ android.view.ViewGroup c;
        public final /* synthetic */ android.os.Bundle d;
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper e;

        public d(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1, android.widget.FrameLayout r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r5) {
                r4 = this;
                android.widget.FrameLayout r5 = r4.a
                r5.removeAllViews()
                android.widget.FrameLayout r5 = r4.a
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0 = r4.e
                com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a(r0)
                android.view.LayoutInflater r1 = r4.b
                android.view.ViewGroup r2 = r4.c
                android.os.Bundle r3 = r4.d
                android.view.View r0 = r0.onCreateView(r1, r2, r3)
                r5.addView(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g {
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper a;

        public e(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r1) {
                r0 = this;
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a()
                r1.onStart()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g {
        public final /* synthetic */ com.huawei.hms.feature.dynamic.DeferredLifecycleHelper a;

        public f(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
                r1 = this;
                r0 = 5
                return r0
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r1) {
                r0 = this;
                com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a()
                r1.onResume()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        int a();

        void a(com.huawei.hms.feature.dynamic.LifecycleDelegate r1);
    }

    static {
            return
    }

    public DeferredLifecycleHelper() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$a r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$a
            r0.<init>(r1)
            r1.d = r0
            return
    }

    public static /* synthetic */ android.os.Bundle a(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0, android.os.Bundle r1) {
            r0.b = r1
            return r1
    }

    public static /* synthetic */ com.huawei.hms.feature.dynamic.LifecycleDelegate a(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0) {
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r0.a
            return r0
    }

    public static /* synthetic */ com.huawei.hms.feature.dynamic.LifecycleDelegate a(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0, com.huawei.hms.feature.dynamic.LifecycleDelegate r1) {
            r0.a = r1
            return r1
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.e
            return r0
    }

    private void a(int r2) {
            r1 = this;
        L0:
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r1.c
            java.lang.Object r0 = r0.getLast()
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g r0 = (com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g) r0
            int r0 = r0.a()
            if (r0 < r2) goto L1c
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r1.c
            r0.removeLast()
            goto L0
        L1c:
            return
    }

    private void a(android.os.Bundle r2, com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g r3) {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r3.a(r0)
            return
        L8:
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r1.c
            if (r0 != 0) goto L13
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.c = r0
        L13:
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r1.c
            r0.add(r3)
            if (r2 == 0) goto L30
            android.os.Bundle r3 = r1.b
            if (r3 != 0) goto L2d
            java.lang.Object r2 = r2.clone()
            if (r2 == 0) goto L30
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L30
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.b = r2
            goto L30
        L2d:
            r3.putAll(r2)
        L30:
            com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<T extends com.huawei.hms.feature.dynamic.LifecycleDelegate> r2 = r1.d
            r1.createDelegate(r2)
            return
    }

    public static /* synthetic */ java.util.LinkedList b(com.huawei.hms.feature.dynamic.DeferredLifecycleHelper r0) {
            java.util.LinkedList<com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g> r0 = r0.c
            return r0
    }

    public abstract void createDelegate(com.huawei.hms.feature.dynamic.OnDelegateCreatedListener<T> r1);

    public T getDelegate() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            return r0
    }

    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$c r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$c
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
            r6 = this;
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r0 = r7.getContext()
            r2.<init>(r0)
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$d r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$d
            r1 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r5, r0)
            return r2
    }

    public void onDestroy() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r0.onDestroy()
            return
        L8:
            r0 = 0
            r1.a(r0)
            return
    }

    public void onDestroyView() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r0.onDestroyView()
            return
        L8:
            r0 = 1
            r1.a(r0)
            return
    }

    public void onInflate(android.app.Activity r2, android.os.Bundle r3, android.os.Bundle r4) {
            r1 = this;
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$b r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$b
            r0.<init>(r1, r2, r3, r4)
            r1.a(r4, r0)
            return
    }

    public void onLowMemory() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L7
            r0.onLowMemory()
        L7:
            return
    }

    public void onPause() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r0.onPause()
            return
        L8:
            r0 = 5
            r1.a(r0)
            return
    }

    public void onResume() {
            r2 = this;
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$f r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$f
            r0.<init>(r2)
            r1 = 0
            r2.a(r1, r0)
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r0.onSaveInstanceState(r2)
            return
        L8:
            android.os.Bundle r0 = r1.b
            if (r0 == 0) goto Lf
            r2.putAll(r0)
        Lf:
            return
    }

    public void onStart() {
            r2 = this;
            com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$e r0 = new com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$e
            r0.<init>(r2)
            r1 = 0
            r2.a(r1, r0)
            return
    }

    public void onStop() {
            r1 = this;
            T extends com.huawei.hms.feature.dynamic.LifecycleDelegate r0 = r1.a
            if (r0 == 0) goto L8
            r0.onStop()
            return
        L8:
            r0 = 4
            r1.a(r0)
            return
    }
}

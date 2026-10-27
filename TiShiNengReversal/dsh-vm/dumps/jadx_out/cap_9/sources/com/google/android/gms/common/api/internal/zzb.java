package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzb extends android.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = null;
    private final java.util.Map zzb;
    private int zzc;

    @androidx.annotation.Nullable
    private android.os.Bundle zzd;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.android.gms.common.api.internal.zzb.zza = r0
            return
    }

    public zzb() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.common.api.internal.zzb r0) {
            int r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Bundle zzb(com.google.android.gms.common.api.internal.zzb r0) {
            android.os.Bundle r0 = r0.zzd
            return r0
    }

    public static com.google.android.gms.common.api.internal.zzb zzc(android.app.Activity r4) {
            java.lang.String r0 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = com.google.android.gms.common.api.internal.zzb.zza
            java.lang.Object r2 = r1.get(r4)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L16
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zzb r2 = (com.google.android.gms.common.api.internal.zzb) r2
            if (r2 != 0) goto L15
            goto L16
        L15:
            return r2
        L16:
            android.app.FragmentManager r2 = r4.getFragmentManager()     // Catch: java.lang.ClassCastException -> L45
            android.app.Fragment r2 = r2.findFragmentByTag(r0)     // Catch: java.lang.ClassCastException -> L45
            com.google.android.gms.common.api.internal.zzb r2 = (com.google.android.gms.common.api.internal.zzb) r2     // Catch: java.lang.ClassCastException -> L45
            if (r2 == 0) goto L28
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L3c
        L28:
            com.google.android.gms.common.api.internal.zzb r2 = new com.google.android.gms.common.api.internal.zzb
            r2.<init>()
            android.app.FragmentManager r3 = r4.getFragmentManager()
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            android.app.FragmentTransaction r0 = r3.add(r2, r0)
            r0.commitAllowingStateLoss()
        L3c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.put(r4, r0)
            return r2
        L45:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String r3, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleCallback r4) {
            r2 = this;
            java.util.Map r0 = r2.zzb
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L23
            java.util.Map r0 = r2.zzb
            r0.put(r3, r4)
            int r0 = r2.zzc
            if (r0 <= 0) goto L22
            com.google.android.gms.internal.common.zzi r0 = new com.google.android.gms.internal.common.zzi
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.zza r1 = new com.google.android.gms.common.api.internal.zza
            r1.<init>(r2, r4, r3)
            r0.post(r1)
        L22:
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LifecycleCallback with tag "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " already added to this fragment."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String r3, @androidx.annotation.Nullable java.io.FileDescriptor r4, java.io.PrintWriter r5, @androidx.annotation.Nullable java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.dump(r3, r4, r5, r6)
            goto Ld
        L1d:
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @androidx.annotation.Nullable
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = r3.cast(r2)
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @androidx.annotation.Nullable
    public final android.app.Activity getLifecycleActivity() {
            r1 = this;
            android.app.Activity r0 = r1.getActivity()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 2
            if (r0 < r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r3, int r4, @androidx.annotation.Nullable android.content.Intent r5) {
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onActivityResult(r3, r4, r5)
            goto Ld
        L1d:
            return
    }

    @Override // android.app.Fragment
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            r0 = 1
            r3.zzc = r0
            r3.zzd = r4
            java.util.Map r0 = r3.zzb
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            if (r4 == 0) goto L31
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r1 = r4.getBundle(r1)
            goto L32
        L31:
            r1 = 0
        L32:
            r2.onCreate(r1)
            goto L12
        L36:
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            r0 = 5
            r2.zzc = r0
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onDestroy()
            goto L10
        L20:
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r2 = this;
            super.onResume()
            r0 = 3
            r2.zzc = r0
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onResume()
            goto L10
        L20:
            return
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle r5) {
            r4 = this;
            super.onSaveInstanceState(r5)
            if (r5 != 0) goto L6
            goto L34
        L6:
            java.util.Map r0 = r4.zzb
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Object r3 = r1.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            r3.onSaveInstanceState(r2)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r5.putBundle(r1, r2)
            goto L10
        L34:
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r2 = this;
            super.onStart()
            r0 = 2
            r2.zzc = r0
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onStart()
            goto L10
        L20:
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r2 = this;
            super.onStop()
            r0 = 4
            r2.zzc = r0
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onStop()
            goto L10
        L20:
            return
    }
}

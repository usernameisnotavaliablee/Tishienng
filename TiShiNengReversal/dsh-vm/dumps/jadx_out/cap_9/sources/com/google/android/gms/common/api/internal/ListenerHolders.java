package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ListenerHolders {
    private final java.util.Set zaa;

    public ListenerHolders() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.zaa = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(@androidx.annotation.NonNull L r1, @androidx.annotation.NonNull android.os.Looper r2, @androidx.annotation.NonNull java.lang.String r3) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.common.api.internal.ListenerHolder r0 = new com.google.android.gms.common.api.internal.ListenerHolder
            r0.<init>(r2, r1, r3)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(@androidx.annotation.NonNull L r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull java.lang.String r3) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Executor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.common.api.internal.ListenerHolder r0 = new com.google.android.gms.common.api.internal.ListenerHolder
            r0.<init>(r2, r1, r3)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(@androidx.annotation.NonNull L r1, @androidx.annotation.NonNull java.lang.String r2) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.internal.ListenerHolder zaa(@androidx.annotation.NonNull java.lang.Object r2, @androidx.annotation.NonNull android.os.Looper r3, @androidx.annotation.NonNull java.lang.String r4) {
            r1 = this;
            java.util.Set r4 = r1.zaa
            java.lang.String r0 = "NO_TYPE"
            com.google.android.gms.common.api.internal.ListenerHolder r2 = createListenerHolder(r2, r3, r0)
            r4.add(r2)
            return r2
    }

    public final void zab() {
            r2 = this;
            java.util.Set r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.ListenerHolder r1 = (com.google.android.gms.common.api.internal.ListenerHolder) r1
            r1.clear()
            goto L6
        L16:
            java.util.Set r0 = r2.zaa
            r0.clear()
            return
    }
}

package io.reactivex.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum SubscriptionHelper extends java.lang.Enum<io.reactivex.internal.subscriptions.SubscriptionHelper> implements org.reactivestreams.Subscription {
    private static final /* synthetic */ io.reactivex.internal.subscriptions.SubscriptionHelper[] $VALUES = null;
    public static final io.reactivex.internal.subscriptions.SubscriptionHelper CANCELLED = null;

    static {
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = new io.reactivex.internal.subscriptions.SubscriptionHelper
            java.lang.String r1 = "CANCELLED"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED = r0
            r1 = 1
            io.reactivex.internal.subscriptions.SubscriptionHelper[] r1 = new io.reactivex.internal.subscriptions.SubscriptionHelper[r1]
            r1[r2] = r0
            io.reactivex.internal.subscriptions.SubscriptionHelper.$VALUES = r1
            return
    }

    SubscriptionHelper(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean cancel(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2) {
            java.lang.Object r0 = r2.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L19
            java.lang.Object r2 = r2.getAndSet(r1)
            org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
            if (r2 == r1) goto L19
            if (r2 == 0) goto L17
            r2.cancel()
        L17:
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static void deferredRequest(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2, java.util.concurrent.atomic.AtomicLong r3, long r4) {
            java.lang.Object r0 = r2.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            if (r0 == 0) goto Lc
            r0.request(r4)
            return
        Lc:
            boolean r0 = validate(r4)
            if (r0 == 0) goto L2a
            io.reactivex.internal.util.BackpressureHelper.add(r3, r4)
            java.lang.Object r2 = r2.get()
            org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
            if (r2 == 0) goto L2a
            r4 = 0
            long r0 = r3.getAndSet(r4)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L2a
            r2.request(r0)
        L2a:
            return
    }

    public static boolean deferredSetOnce(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3, java.util.concurrent.atomic.AtomicLong r4, org.reactivestreams.Subscription r5) {
            boolean r3 = setOnce(r3, r5)
            if (r3 == 0) goto L15
            r0 = 0
            long r3 = r4.getAndSet(r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L13
            r5.request(r3)
        L13:
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    public static boolean isCancelled(org.reactivestreams.Subscription r1) {
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean replace(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2, org.reactivestreams.Subscription r3) {
        L0:
            java.lang.Object r0 = r2.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.cancel()
        Lf:
            r2 = 0
            return r2
        L11:
            boolean r0 = androidx.camera.view.p.a(r2, r0, r3)
            if (r0 == 0) goto L0
            r2 = 1
            return r2
    }

    public static void reportMoreProduced(long r3) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "More produced than requested: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    public static void reportSubscriptionSet() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Subscription already set!"
            r0.<init>(r1)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    public static boolean set(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2, org.reactivestreams.Subscription r3) {
        L0:
            java.lang.Object r0 = r2.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.cancel()
        Lf:
            r2 = 0
            return r2
        L11:
            boolean r1 = androidx.camera.view.p.a(r2, r0, r3)
            if (r1 == 0) goto L0
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            r2 = 1
            return r2
    }

    public static boolean setOnce(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1, org.reactivestreams.Subscription r2) {
            java.lang.String r0 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 != 0) goto L1c
            r2.cancel()
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r1 == r2) goto L1a
            reportSubscriptionSet()
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static boolean validate(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L21
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n > 0 required but it was "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public static boolean validate(org.reactivestreams.Subscription r1, org.reactivestreams.Subscription r2) {
            r0 = 0
            if (r2 != 0) goto Le
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "next is null"
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            return r0
        Le:
            if (r1 == 0) goto L17
            r2.cancel()
            reportSubscriptionSet()
            return r0
        L17:
            r1 = 1
            return r1
    }

    public static io.reactivex.internal.subscriptions.SubscriptionHelper valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.subscriptions.SubscriptionHelper> r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = (io.reactivex.internal.subscriptions.SubscriptionHelper) r1
            return r1
    }

    public static io.reactivex.internal.subscriptions.SubscriptionHelper[] values() {
            io.reactivex.internal.subscriptions.SubscriptionHelper[] r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.subscriptions.SubscriptionHelper[] r0 = (io.reactivex.internal.subscriptions.SubscriptionHelper[]) r0
            return r0
    }

    public void cancel() {
            r0 = this;
            return
    }

    public void request(long r1) {
            r0 = this;
            return
    }
}

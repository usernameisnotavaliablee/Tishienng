package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DeferrableSurfaces {


    private DeferrableSurfaces() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(java.util.List r6, java.util.concurrent.ScheduledExecutorService r7, java.util.concurrent.Executor r8, long r9, boolean r11, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r12) {
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(r6)
            androidx.camera.core.impl.v r0 = new androidx.camera.core.impl.v
            r1 = r8
            r4 = r9
            r3 = r12
            r0.<init>(r1, r2, r3, r4)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r7.schedule(r0, r4, r6)
            androidx.camera.core.impl.w r7 = new androidx.camera.core.impl.w
            r7.<init>(r2)
            r3.addCancellationListener(r7, r1)
            androidx.camera.core.impl.DeferrableSurfaces$1 r7 = new androidx.camera.core.impl.DeferrableSurfaces$1
            r7.<init>(r11, r3, r6)
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r2, r7, r1)
            java.lang.String r6 = "surfaceList"
            return r6
    }

    public static /* synthetic */ void b(java.util.concurrent.Executor r1, com.google.common.util.concurrent.ListenableFuture r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3, long r4) {
            androidx.camera.core.impl.u r0 = new androidx.camera.core.impl.u
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
    }

    public static /* synthetic */ void c(com.google.common.util.concurrent.ListenableFuture r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4, long r5) {
            boolean r0 = r3.isDone()
            if (r0 != 0) goto L23
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot complete surfaceList within "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r4.setException(r0)
            r4 = 1
            r3.cancel(r4)
        L23:
            return
    }

    public static /* synthetic */ void d(com.google.common.util.concurrent.ListenableFuture r1) {
            r0 = 1
            r1.cancel(r0)
            return
    }

    public static void decrementAll(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r1) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            r0.decrementUseCount()
            goto L4
        L14:
            return
    }

    public static void incrementAll(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r3) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2b
            r0 = 0
        L7:
            java.lang.Object r1 = r3.get(r0)     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L19
            androidx.camera.core.impl.DeferrableSurface r1 = (androidx.camera.core.impl.DeferrableSurface) r1     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L19
            r1.incrementUseCount()     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L19
            int r0 = r0 + 1
            int r1 = r3.size()     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L19
            if (r0 < r1) goto L7
            goto L2b
        L19:
            r1 = move-exception
            int r0 = r0 + (-1)
        L1c:
            if (r0 < 0) goto L2a
            java.lang.Object r2 = r3.get(r0)
            androidx.camera.core.impl.DeferrableSurface r2 = (androidx.camera.core.impl.DeferrableSurface) r2
            r2.decrementUseCount()
            int r0 = r0 + (-1)
            goto L1c
        L2a:
            throw r1
        L2b:
            return
    }

    @androidx.annotation.NonNull
    public static com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> surfaceListWithTimeout(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.DeferrableSurface> r7, boolean r8, long r9, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r12) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r7.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getSurface()
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            r1.add(r0)
            goto L9
        L21:
            androidx.camera.core.impl.t r0 = new androidx.camera.core.impl.t
            r6 = r8
            r4 = r9
            r3 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r6)
            com.google.common.util.concurrent.ListenableFuture r7 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r7
    }

    public static boolean tryIncrementAll(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r0) {
            incrementAll(r0)     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}

package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzaj<V> extends com.google.android.gms.internal.mlkit_acceleration.zzbj implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final boolean zza = false;
    static final com.google.android.gms.internal.mlkit_acceleration.zzba zzb = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zza zzc = null;
    private static final java.lang.Object zzd = null;

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd listeners;

    @javax.annotation.CheckForNull
    private volatile java.lang.Object value;

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk waiters;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class zza {
        /* synthetic */ zza(com.google.android.gms.internal.mlkit_acceleration.zzai r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zza(com.google.android.gms.internal.mlkit_acceleration.zzaj r1, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r2);

        abstract com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zzb(com.google.android.gms.internal.mlkit_acceleration.zzaj r1, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2);

        abstract void zzc(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r1, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2);

        abstract void zzd(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r1, java.lang.Thread r2);

        abstract boolean zze(com.google.android.gms.internal.mlkit_acceleration.zzaj r1, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r2, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r3);

        abstract boolean zzf(com.google.android.gms.internal.mlkit_acceleration.zzaj r1, @javax.annotation.CheckForNull java.lang.Object r2, java.lang.Object r3);

        abstract boolean zzg(com.google.android.gms.internal.mlkit_acceleration.zzaj r1, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzb {

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb zza = null;

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb zzb = null;
        final boolean zzc;

        @javax.annotation.CheckForNull
        final java.lang.Throwable zzd;

        static {
                boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
                r1 = 0
                if (r0 == 0) goto La
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zzb = r1
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zza = r1
                return
            La:
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
                r2 = 0
                r0.<init>(r2, r1)
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zzb = r0
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
                r2 = 1
                r0.<init>(r2, r1)
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zza = r0
                return
        }

        zzb(boolean r1, @javax.annotation.CheckForNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.zzc = r1
                r0.zzd = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzc {
        static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc zza = null;
        final java.lang.Throwable zzb;


        static {
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc$1 r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc$1
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc.zza = r0
                return
        }

        zzc(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r1.getClass()
                r0.zzb = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzd {
        static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zza = null;

        @javax.annotation.CheckForNull
        com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd next;

        @javax.annotation.CheckForNull
        final java.lang.Runnable zzb;

        @javax.annotation.CheckForNull
        final java.util.concurrent.Executor zzc;

        static {
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd
                r0.<init>()
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd.zza = r0
                return
        }

        zzd() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zzb = r0
                r1.zzc = r0
                return
        }

        zzd(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.zzb = r1
                r0.zzc = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zze extends com.google.android.gms.internal.mlkit_acceleration.zzaj.zza {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk, java.lang.Thread> zza;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk> zzb;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk> zzc;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd> zzd;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, java.lang.Object> zze;

        zze(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.zza = r2
                r1.zzb = r3
                r1.zzc = r4
                r1.zzd = r5
                r1.zze = r6
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zza(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd> r0 = r1.zzd
                java.lang.Object r2 = r0.getAndSet(r2, r3)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r2 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd) r2
                return r2
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zzb(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk> r0 = r1.zzc
                java.lang.Object r2 = r0.getAndSet(r2, r3)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r2 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk) r2
                return r2
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzc(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk, com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk> r0 = r1.zzb
                r0.lazySet(r2, r3)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzd(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk, java.lang.Thread> r0 = r1.zza
                r0.lazySet(r2, r3)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zze(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r3, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd> r0 = r1.zzd
                boolean r2 = com.google.android.gms.internal.mlkit_acceleration.zzak.zza(r0, r2, r3, r4)
                return r2
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, java.lang.Object> r0 = r1.zze
                boolean r2 = com.google.android.gms.internal.mlkit_acceleration.zzak.zza(r0, r2, r3, r4)
                return r2
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_acceleration.zzaj, com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk> r0 = r1.zzc
                boolean r2 = com.google.android.gms.internal.mlkit_acceleration.zzak.zza(r0, r2, r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzf<V> implements java.lang.Runnable {
        final com.google.android.gms.internal.mlkit_acceleration.zzaj<V> zza;
        final com.google.common.util.concurrent.ListenableFuture<? extends V> zzb;

        public zzf() {
                r1 = this;
                r1.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                r0 = 0
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzg extends com.google.android.gms.internal.mlkit_acceleration.zzaj.zza {
        private zzg() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ zzg(com.google.android.gms.internal.mlkit_acceleration.zzal r1) {
                r0 = this;
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zza(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r3) {
                r1 = this;
                monitor-enter(r2)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb(r2)     // Catch: java.lang.Throwable -> Lb
                if (r0 == r3) goto Ld
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzg(r2, r3)     // Catch: java.lang.Throwable -> Lb
                goto Ld
            Lb:
                r3 = move-exception
                goto Lf
            Ld:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                return r0
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                throw r3
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zzb(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3) {
                r1 = this;
                monitor-enter(r2)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc(r2)     // Catch: java.lang.Throwable -> Lb
                if (r0 == r3) goto Ld
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzi(r2, r3)     // Catch: java.lang.Throwable -> Lb
                goto Ld
            Lb:
                r3 = move-exception
                goto Lf
            Ld:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                return r0
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                throw r3
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzc(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r1, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzd(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zze(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r3, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzg(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzh(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_acceleration.zzaj r2, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r3, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r4) {
                r1 = this;
                monitor-enter(r2)
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc(r2)     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto Lf
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzi(r2, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            Ld:
                r3 = move-exception
                goto L12
            Lf:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            L12:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface zzh<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class zzi<V> extends com.google.android.gms.internal.mlkit_acceleration.zzaj<V> implements com.google.android.gms.internal.mlkit_acceleration.zzaj.zzh<V> {
        zzi() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzj extends com.google.android.gms.internal.mlkit_acceleration.zzaj.zza {
        static final sun.misc.Unsafe zza = null;
        static final long zzb = 0;
        static final long zzc = 0;
        static final long zzd = 0;
        static final long zze = 0;
        static final long zzf = 0;


        static {
                java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk> r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L7
                goto L12
            L7:
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzj$1 r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzj$1     // Catch: java.security.PrivilegedActionException -> L5a
                r1.<init>()     // Catch: java.security.PrivilegedActionException -> L5a
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.security.PrivilegedActionException -> L5a
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.security.PrivilegedActionException -> L5a
            L12:
                java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzaj> r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzc = r3     // Catch: java.lang.NoSuchFieldException -> L53
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L53
                long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzb = r3     // Catch: java.lang.NoSuchFieldException -> L53
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzd = r2     // Catch: java.lang.NoSuchFieldException -> L53
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L53
                long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zze = r2     // Catch: java.lang.NoSuchFieldException -> L53
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L53
                long r2 = r1.objectFieldOffset(r0)     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzf = r2     // Catch: java.lang.NoSuchFieldException -> L53
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza = r1     // Catch: java.lang.NoSuchFieldException -> L53
                return
            L53:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L5a:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
        }

        private zzj() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ zzj(com.google.android.gms.internal.mlkit_acceleration.zzan r1) {
                r0 = this;
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zza(com.google.android.gms.internal.mlkit_acceleration.zzaj r3, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r4) {
                r2 = this;
            L0:
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb(r3)
                if (r4 != r0) goto L7
                goto Ld
            L7:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L0
            Ld:
                return r0
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zzb(com.google.android.gms.internal.mlkit_acceleration.zzaj r3, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r4) {
                r2 = this;
            L0:
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc(r3)
                if (r4 != r0) goto L7
                goto Ld
            L7:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L0
            Ld:
                return r0
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzc(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r4, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza
                long r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzf
                r0.putObject(r4, r1, r5)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final void zzd(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r4, java.lang.Thread r5) {
                r3 = this;
                sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza
                long r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zze
                r0.putObject(r4, r1, r5)
                return
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zze(com.google.android.gms.internal.mlkit_acceleration.zzaj r7, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r8, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza
                long r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzb
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.zzam.zza(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_acceleration.zzaj r7, @javax.annotation.CheckForNull java.lang.Object r8, java.lang.Object r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza
                long r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzd
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.zzam.zza(r0, r1, r2, r4, r5)
                return r7
        }

        @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_acceleration.zzaj r7, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r8, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r9) {
                r6 = this;
                sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zza
                long r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzj.zzc
                r1 = r7
                r4 = r8
                r5 = r9
                boolean r7 = com.google.android.gms.internal.mlkit_acceleration.zzam.zza(r0, r1, r2, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zzk {
        static final com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zza = null;

        @javax.annotation.CheckForNull
        volatile com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk next;

        @javax.annotation.CheckForNull
        volatile java.lang.Thread thread;

        static {
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk
                r1 = 0
                r0.<init>(r1)
                com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza = r0
                return
        }

        zzk() {
                r2 = this;
                r2.<init>()
                com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zza()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.zzd(r2, r1)
                return
        }

        zzk(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk> r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.class
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r2)     // Catch: java.lang.SecurityException -> Lf
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.SecurityException -> Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.gms.internal.mlkit_acceleration.zzaj.zza = r0
            com.google.android.gms.internal.mlkit_acceleration.zzba r0 = new com.google.android.gms.internal.mlkit_acceleration.zzba
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzaj> r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.class
            r0.<init>(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb = r0
            r3 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzj r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzj     // Catch: java.lang.Error -> L24 java.lang.Exception -> L27
            r0.<init>(r3)     // Catch: java.lang.Error -> L24 java.lang.Exception -> L27
            r6 = r3
            r12 = r6
            goto L61
        L24:
            r0 = move-exception
        L25:
            r4 = r0
            goto L29
        L27:
            r0 = move-exception
            goto L25
        L29:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zze r5 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zze     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r6 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r6)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r1, r0)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd> r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd.class
            java.lang.String r1 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Error -> L56 java.lang.Exception -> L58
            r6 = r3
            r12 = r4
            r0 = r5
            goto L61
        L56:
            r0 = move-exception
            goto L59
        L58:
            r0 = move-exception
        L59:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzg r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzg
            r1.<init>(r3)
            r6 = r0
            r0 = r1
            r12 = r4
        L61:
            com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc = r0
            if (r6 == 0) goto L84
            com.google.android.gms.internal.mlkit_acceleration.zzba r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            java.util.logging.Logger r7 = r0.zza()
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r10 = "<clinit>"
            java.lang.String r11 = "UnsafeAtomicHelper is broken!"
            java.lang.String r9 = "com.google.common.util.concurrent.AbstractFuture"
            r8 = r2
            r7.logp(r8, r9, r10, r11, r12)
            java.util.logging.Logger r1 = r0.zza()
            java.lang.String r4 = "<clinit>"
            java.lang.String r5 = "SafeAtomicHelper is broken!"
            java.lang.String r3 = "com.google.common.util.concurrent.AbstractFuture"
            r1.logp(r2, r3, r4, r5, r6)
        L84:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd = r0
            return
    }

    protected zzaj() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzaj.zza zza() {
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd zzb(com.google.android.gms.internal.mlkit_acceleration.zzaj r0) {
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = r0.listeners
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk zzc(com.google.android.gms.internal.mlkit_acceleration.zzaj r0) {
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = r0.waiters
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.internal.mlkit_acceleration.zzaj r0) {
            java.lang.Object r0 = r0.value
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.mlkit_acceleration.zzaj r0, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd r1) {
            r0.listeners = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.mlkit_acceleration.zzaj r0, java.lang.Object r1) {
            r0.value = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.mlkit_acceleration.zzaj r0, com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r1) {
            r0.waiters = r1
            return
    }

    private static java.lang.Object zzn(com.google.common.util.concurrent.ListenableFuture r7) {
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzh
            r2 = 0
            if (r1 == 0) goto L27
            com.google.android.gms.internal.mlkit_acceleration.zzaj r7 = (com.google.android.gms.internal.mlkit_acceleration.zzaj) r7
            java.lang.Object r7 = r7.value
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            if (r0 == 0) goto L23
            r0 = r7
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r0 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb) r0
            boolean r1 = r0.zzc
            if (r1 == 0) goto L23
            java.lang.Throwable r7 = r0.zzd
            if (r7 == 0) goto L21
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
            r0.<init>(r2, r7)
            r7 = r0
            goto L23
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r7 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zzb
        L23:
            java.util.Objects.requireNonNull(r7)
            return r7
        L27:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_acceleration.zzbj
            if (r1 == 0) goto L3b
            r1 = r7
            com.google.android.gms.internal.mlkit_acceleration.zzbj r1 = (com.google.android.gms.internal.mlkit_acceleration.zzbj) r1
            java.lang.Throwable r1 = r1.zzf()
            if (r1 != 0) goto L35
            goto L3b
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r7 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
            r7.<init>(r1)
            return r7
        L3b:
            boolean r1 = r7.isCancelled()
            boolean r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L4c
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r7 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zzb
            java.util.Objects.requireNonNull(r7)
            return r7
        L4c:
            java.lang.Object r3 = zzo(r7)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            if (r1 == 0) goto L74
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r3 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            r6.append(r0)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            r6.append(r5)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            java.lang.String r5 = r6.toString()     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            r4.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            r3.<init>(r2, r4)     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            return r3
        L70:
            r0 = move-exception
            goto L81
        L72:
            r3 = move-exception
            goto L9e
        L74:
            if (r3 != 0) goto L79
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd     // Catch: java.util.concurrent.CancellationException -> L70 java.util.concurrent.ExecutionException -> L72 java.lang.Throwable -> L7a
            return r7
        L79:
            return r3
        L7a:
            r7 = move-exception
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
            r0.<init>(r7)
            return r0
        L81:
            if (r1 != 0) goto L98
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            java.lang.String r7 = r3.concat(r7)
            r2.<init>(r7, r0)
            r1.<init>(r2)
            return r1
        L98:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r7 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
            r7.<init>(r2, r0)
            return r7
        L9e:
            if (r1 == 0) goto Lb3
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r0.concat(r7)
            r4.<init>(r7, r3)
            r1.<init>(r2, r4)
            return r1
        Lb3:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r7 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
            java.lang.Throwable r0 = r3.getCause()
            r7.<init>(r0)
            return r7
    }

    private static java.lang.Object zzo(java.util.concurrent.Future r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1b
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 != 0) goto L13
            goto L1a
        L13:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1a:
            throw r1
        L1b:
            r0 = 1
            goto L1
    }

    private final void zzp(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = zzo(r3)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            if (r1 != 0) goto L17
            java.lang.String r1 = "null"
            r4.append(r1)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            goto L3a
        L13:
            r0 = move-exception
            goto L3e
        L15:
            r1 = move-exception
            goto L56
        L17:
            if (r1 != r3) goto L1f
            java.lang.String r1 = "this future"
            r4.append(r1)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            goto L3a
        L1f:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            r4.append(r2)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            java.lang.String r2 = "@"
            r4.append(r2)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            int r1 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            r4.append(r1)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
        L3a:
            r4.append(r0)     // Catch: java.lang.Exception -> L13 java.util.concurrent.ExecutionException -> L15 java.util.concurrent.CancellationException -> L50
            return
        L3e:
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            return
        L50:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            return
        L56:
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
            return
    }

    private final void zzq(java.lang.StringBuilder r6) {
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.value
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzf r1 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf) r1
            com.google.common.util.concurrent.ListenableFuture<? extends V> r1 = r1.zzb
            r5.zzr(r6, r1)
            r6.append(r3)
            goto L4e
        L21:
            java.lang.String r1 = r5.zze()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            if (r4 == 0) goto L41
        L2e:
            r1 = r2
            goto L41
        L30:
            r1 = move-exception
            goto L33
        L32:
            r1 = move-exception
        L33:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L41:
            if (r1 == 0) goto L4e
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            r6.append(r3)
        L4e:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5e
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.zzp(r6)
        L5e:
            return
    }

    private final void zzr(java.lang.StringBuilder r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            if (r3 != r1) goto Lc
            java.lang.String r3 = "this future"
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> L8 java.lang.Exception -> La
            return
        L8:
            r3 = move-exception
            goto L10
        La:
            r3 = move-exception
            goto L10
        Lc:
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> L8 java.lang.Exception -> La
            return
        L10:
            java.lang.String r0 = "Exception thrown from implementation: "
            r2.append(r0)
            java.lang.Class r3 = r3.getClass()
            r2.append(r3)
            return
    }

    private static void zzs(com.google.android.gms.internal.mlkit_acceleration.zzaj r5, boolean r6) {
            r6 = 0
            r0 = r6
        L2:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r1 = r1.zzb(r5, r2)
        La:
            if (r1 == 0) goto L18
            java.lang.Thread r2 = r1.thread
            if (r2 == 0) goto L15
            r1.thread = r6
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L15:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r1 = r1.next
            goto La
        L18:
            r5.zzj()
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd.zza
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r5 = r1.zza(r5, r2)
            r4 = r0
            r0 = r5
            r5 = r4
        L26:
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r1 = r0.next
            r0.next = r5
            r5 = r0
            r0 = r1
            goto L26
        L2f:
            if (r5 == 0) goto L62
            java.lang.Runnable r0 = r5.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r1 = r5.next
            java.util.Objects.requireNonNull(r0)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            boolean r2 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            if (r2 == 0) goto L56
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzf r0 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf) r0
            com.google.android.gms.internal.mlkit_acceleration.zzaj<V> r5 = r0.zza
            java.lang.Object r2 = r5.value
            if (r2 != r0) goto L60
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r0.zzb
            java.lang.Object r2 = zzn(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            boolean r0 = r3.zzf(r5, r0, r2)
            if (r0 == 0) goto L60
            r0 = r1
            goto L2
        L56:
            java.util.concurrent.Executor r5 = r5.zzc
            java.util.Objects.requireNonNull(r5)
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            zzt(r0, r5)
        L60:
            r5 = r1
            goto L2f
        L62:
            return
    }

    private static void zzt(java.lang.Runnable r6, java.util.concurrent.Executor r7) {
            r7.execute(r6)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.internal.mlkit_acceleration.zzba r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            java.util.logging.Logger r0 = r0.zza()
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "RuntimeException while executing runnable "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " with executor "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "com.google.common.util.concurrent.AbstractFuture"
            java.lang.String r3 = "executeListener"
            r0.logp(r1, r2, r3, r4, r5)
            return
    }

    private final void zzu(com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r5 = r4.waiters
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            if (r5 == r1) goto L28
            r1 = r0
        La:
            if (r5 == 0) goto L28
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r2 = r5.next
            java.lang.Thread r3 = r5.thread
            if (r3 == 0) goto L14
            r1 = r5
            goto L26
        L14:
            if (r1 == 0) goto L1d
            r1.next = r2
            java.lang.Thread r5 = r1.thread
            if (r5 != 0) goto L26
            goto L3
        L1d:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            boolean r5 = r3.zzg(r4, r5, r2)
            if (r5 != 0) goto L26
            goto L3
        L26:
            r5 = r2
            goto La
        L28:
            return
    }

    private static final java.lang.Object zzv(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            if (r0 != 0) goto Le
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r2 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc) r2
            java.lang.Throwable r2 = r2.zzb
            r0.<init>(r2)
            throw r0
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r2 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb) r2
            java.lang.Throwable r2 = r2.zzd
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.android.gms.internal.mlkit_acceleration.zzv.zza(r4, r0)
            java.lang.String r0 = "Executor was null."
            com.google.android.gms.internal.mlkit_acceleration.zzv.zza(r5, r0)
            boolean r0 = r3.isDone()
            if (r0 != 0) goto L2c
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = r3.listeners
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd.zza
            if (r0 == r1) goto L2c
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd
            r1.<init>(r4, r5)
        L1b:
            r1.next = r0
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            boolean r0 = r2.zze(r3, r0, r1)
            if (r0 == 0) goto L26
            return
        L26:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r0 = r3.listeners
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzd r2 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd.zza
            if (r0 != r2) goto L1b
        L2c:
            zzt(r4, r5)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zza
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r1 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r1 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r6 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzs(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            if (r4 == 0) goto L57
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzf r0 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzh
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.mlkit_acceleration.zzaj r4 = (com.google.android.gms.internal.mlkit_acceleration.zzaj) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = 1
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L64
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = zzv(r0)
            return r0
        L1a:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = r6.waiters
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            if (r0 == r3) goto L5a
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r3 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk
            r3.<init>()
        L25:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r4 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            r4.zzc(r3, r0)
            boolean r0 = r4.zzg(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = zzv(r0)
            return r0
        L4b:
            r6.zzu(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r0 = r6.waiters
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r4 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = zzv(r0)
            return r0
        L64:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L17d
            java.lang.Object r6 = r0.value
            r8 = 1
            if (r6 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = 0
        L18:
            boolean r10 = r6 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L23
            java.lang.Object r1 = zzv(r6)
            return r1
        L23:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L30
        L2f:
            r11 = r9
        L30:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L97
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r6 = r0.waiters
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r15 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            if (r6 == r15) goto L8d
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r15 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk
            r15.<init>()
        L41:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r7 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            r7.zzc(r15, r6)
            boolean r6 = r7.zzg(r0, r6, r15)
            if (r6 == 0) goto L87
        L4c:
            r6 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r4 = java.lang.Math.min(r4, r6)
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L7e
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = 0
        L65:
            boolean r6 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L70
            java.lang.Object r1 = zzv(r4)
            return r1
        L70:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L4c
            r0.zzu(r15)
            goto L97
        L7e:
            r0.zzu(r15)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L87:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r6 = r0.waiters
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzk r7 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzk.zza
            if (r6 != r7) goto L41
        L8d:
            java.lang.Object r1 = r0.value
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = zzv(r1)
            return r1
        L97:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lc0
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto La1
            r5 = 1
            goto La2
        La1:
            r5 = 0
        La2:
            boolean r6 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto Lad
            java.lang.Object r1 = zzv(r4)
            return r1
        Lad:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto Lba
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L97
        Lba:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        Lc0:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = r3.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r11)
            java.lang.String r12 = r3.toString()
            java.lang.String r11 = r12.toLowerCase(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "Waited "
            r12.append(r15)
            r12.append(r1)
            java.lang.String r1 = " "
            r12.append(r1)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            long r11 = r4 + r13
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 >= 0) goto L151
            java.lang.String r11 = " (plus "
            java.lang.String r2 = r2.concat(r11)
            long r4 = -r4
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r3.convert(r4, r11)
            long r16 = r3.toNanos(r11)
            long r4 = r4 - r16
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L112
            int r9 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r9 <= 0) goto L111
            goto L112
        L111:
            r8 = 0
        L112:
            if (r3 <= 0) goto L135
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r11)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            if (r8 == 0) goto L131
            java.lang.String r3 = ","
            java.lang.String r2 = r2.concat(r3)
        L131:
            java.lang.String r2 = r2.concat(r1)
        L135:
            if (r8 == 0) goto L14b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L14b:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = r2.concat(r1)
        L151:
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L163
            java.lang.String r1 = " but future completed as timeout expired"
            java.lang.String r1 = r2.concat(r1)
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            r2.<init>(r1)
            throw r2
        L163:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L17d:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzf
            r2 = 1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r1 = r1 ^ r2
            r0 = r0 & r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r3.value
            boolean r1 = r1 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L5a
        L4d:
            boolean r1 = r3.isDone()
            if (r1 == 0) goto L57
            r3.zzp(r0)
            goto L5a
        L57:
            r3.zzq(r0)
        L5a:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @javax.annotation.CheckForNull
    protected java.lang.String zze() {
            r4 = this;
            boolean r0 = r4 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L24
            r0 = r4
            java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.getDelay(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remaining delay=["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ms]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbj
    @javax.annotation.CheckForNull
    protected final java.lang.Throwable zzf() {
            r2 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzh
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            if (r1 == 0) goto Lf
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r0 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc) r0
            java.lang.Throwable r0 = r0.zzb
            return r0
        Lf:
            r0 = 0
            return r0
    }

    protected void zzj() {
            r0 = this;
            return
    }

    protected final boolean zzk(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzd
        L4:
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r0 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            r1 = 0
            boolean r3 = r0.zzf(r2, r1, r3)
            r0 = 0
            if (r3 == 0) goto L13
            zzs(r2, r0)
            r3 = 1
            return r3
        L13:
            return r0
    }

    protected final boolean zzl(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc r0 = new com.google.android.gms.internal.mlkit_acceleration.zzaj$zzc
            r0.<init>(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zza r3 = com.google.android.gms.internal.mlkit_acceleration.zzaj.zzc
            r1 = 0
            boolean r3 = r3.zzf(r2, r1, r0)
            r0 = 0
            if (r3 == 0) goto L14
            zzs(r2, r0)
            r3 = 1
            return r3
        L14:
            return r0
    }

    protected final boolean zzm() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb
            if (r1 == 0) goto Le
            com.google.android.gms.internal.mlkit_acceleration.zzaj$zzb r0 = (com.google.android.gms.internal.mlkit_acceleration.zzaj.zzb) r0
            boolean r0 = r0.zzc
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}

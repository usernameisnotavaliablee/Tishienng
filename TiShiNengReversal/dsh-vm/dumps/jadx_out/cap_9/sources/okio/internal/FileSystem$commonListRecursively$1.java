package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack", "child"}, s = {"L$0", "L$1", "L$3"}, v = 1)
/* renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FileSystem$commonListRecursively$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super okio.Path>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ okio.Path $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ okio.FileSystem $this_commonListRecursively;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    FileSystem$commonListRecursively$1(okio.Path r1, okio.FileSystem r2, boolean r3, kotlin.coroutines.e<? super okio.internal.FileSystem$commonListRecursively$1> r4) {
            r0 = this;
            r0.$dir = r1
            r0.$this_commonListRecursively = r2
            r0.$followSymlinks = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r5, kotlin.coroutines.e<?> r6) {
            r4 = this;
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            okio.Path r1 = r4.$dir
            okio.FileSystem r2 = r4.$this_commonListRecursively
            boolean r3 = r4.$followSymlinks
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlin.sequences.o<? super okio.Path> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            okio.internal.-FileSystem$commonListRecursively$1 r1 = (okio.internal.FileSystem$commonListRecursively$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.L$0
            r1 = r0
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r9.label
            r8 = 1
            if (r2 == 0) goto L28
            if (r2 != r8) goto L20
            java.lang.Object r2 = r9.L$3
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r2 = r9.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r9.L$1
            kotlin.collections.m r3 = (kotlin.collections.m) r3
            kotlin.g0.n(r10)
            goto L42
        L20:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L28:
            kotlin.g0.n(r10)
            kotlin.collections.m r10 = new kotlin.collections.m
            r10.<init>()
            okio.Path r2 = r9.$dir
            r10.addLast(r2)
            okio.FileSystem r2 = r9.$this_commonListRecursively
            okio.Path r3 = r9.$dir
            java.util.List r2 = r2.list(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = r10
        L42:
            r10 = r2
        L43:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r10.next()
            r4 = r2
            okio.Path r4 = (okio.Path) r4
            okio.FileSystem r2 = r9.$this_commonListRecursively
            boolean r5 = r9.$followSymlinks
            r9.L$0 = r1
            r9.L$1 = r3
            r9.L$2 = r10
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r4)
            r9.L$3 = r6
            r9.label = r8
            r6 = 0
            r7 = r9
            java.lang.Object r2 = okio.internal.FileSystem.collectRecursively(r1, r2, r3, r4, r5, r6, r7)
            if (r2 != r0) goto L43
            return r0
        L6b:
            kotlin.n1 r10 = kotlin.n1.a
            return r10
    }
}

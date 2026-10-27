package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "children", "symlinkPath", "child", "followSymlinks", "postorder", "symlinkCount", "$this$collectRecursively", "fileSystem", "stack", "path", "children", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1"}, v = 1)
/* renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FileSystem$collectRecursively$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ java.lang.Object result;

    FileSystem$collectRecursively$1(kotlin.coroutines.e<? super okio.internal.FileSystem$collectRecursively$1> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            r7.result = r8
            int r8 = r7.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.label = r8
            r4 = 0
            r5 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = r7
            java.lang.Object r8 = okio.internal.FileSystem.collectRecursively(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }
}

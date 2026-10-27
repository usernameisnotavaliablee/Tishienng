package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class DTK {
    protected final org.apache.harmony.awt.datatransfer.DataTransferThread dataTransferThread;
    private org.apache.harmony.awt.datatransfer.NativeClipboard nativeClipboard;
    private org.apache.harmony.awt.datatransfer.NativeClipboard nativeSelection;
    protected java.awt.datatransfer.SystemFlavorMap systemFlavorMap;

    protected DTK() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nativeClipboard = r0
            r1.nativeSelection = r0
            org.apache.harmony.awt.datatransfer.DataTransferThread r0 = new org.apache.harmony.awt.datatransfer.DataTransferThread
            r0.<init>(r1)
            r1.dataTransferThread = r0
            r0.start()
            return
    }

    private static org.apache.harmony.awt.datatransfer.DTK createDTK() {
            int r0 = org.apache.harmony.misc.SystemUtils.getOS()
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 2
            if (r0 != r1) goto Ld
            java.lang.String r0 = "org.apache.harmony.awt.datatransfer.linux.LinuxDTK"
            goto L1b
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "awt.4E"
            java.lang.String r1 = org.apache.harmony.awt.internal.nls.Messages.getString(r1)
            r0.<init>(r1)
            throw r0
        L19:
            java.lang.String r0 = "org.apache.harmony.awt.datatransfer.windows.WinDTK"
        L1b:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L26
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L26
            org.apache.harmony.awt.datatransfer.DTK r0 = (org.apache.harmony.awt.datatransfer.DTK) r0     // Catch: java.lang.Exception -> L26
            return r0
        L26:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static org.apache.harmony.awt.datatransfer.DTK getDTK() {
            java.lang.Object r0 = org.apache.harmony.awt.ContextStorage.getContextLock()
            monitor-enter(r0)
            boolean r1 = org.apache.harmony.awt.ContextStorage.shutdownPending()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r0 = 0
            return r0
        Le:
            r1 = move-exception
            goto L1f
        L10:
            org.apache.harmony.awt.datatransfer.DTK r1 = org.apache.harmony.awt.ContextStorage.getDTK()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L1d
            org.apache.harmony.awt.datatransfer.DTK r1 = createDTK()     // Catch: java.lang.Throwable -> Le
            org.apache.harmony.awt.ContextStorage.setDTK(r1)     // Catch: java.lang.Throwable -> Le
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    protected void appendSystemFlavorMap(java.awt.datatransfer.SystemFlavorMap r1, java.awt.datatransfer.DataFlavor r2, java.lang.String r3) {
            r0 = this;
            r1.addFlavorForUnencodedNative(r3, r2)
            r1.addUnencodedNativeForFlavor(r2, r3)
            return
    }

    protected void appendSystemFlavorMap(java.awt.datatransfer.SystemFlavorMap r3, java.lang.String[] r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            org.apache.harmony.awt.datatransfer.TextFlavor.addUnicodeClasses(r3, r6, r5)
            r0 = 0
        L4:
            int r1 = r4.length
            if (r0 < r1) goto L8
            return
        L8:
            r1 = r4[r0]
            if (r1 == 0) goto L17
            boolean r1 = java.nio.charset.Charset.isSupported(r1)
            if (r1 == 0) goto L17
            r1 = r4[r0]
            org.apache.harmony.awt.datatransfer.TextFlavor.addCharsetClasses(r3, r6, r5, r1)
        L17:
            int r0 = r0 + 1
            goto L4
    }

    public abstract java.awt.dnd.peer.DragSourceContextPeer createDragSourceContextPeer(java.awt.dnd.DragGestureEvent r1);

    public abstract java.awt.dnd.peer.DropTargetContextPeer createDropTargetContextPeer(java.awt.dnd.DropTargetContext r1);

    protected java.lang.String[] getCharsets() {
            r5 = this;
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r1 = "US-ASCII"
            java.lang.String r2 = "UTF-16"
            java.lang.String r3 = "UTF-8"
            java.lang.String r4 = "unicode"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            return r0
    }

    public java.lang.String getDefaultCharset() {
            r1 = this;
            java.lang.String r0 = "unicode"
            return r0
    }

    public org.apache.harmony.awt.datatransfer.NativeClipboard getNativeClipboard() {
            r1 = this;
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.nativeClipboard
            if (r0 != 0) goto La
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.newNativeClipboard()
            r1.nativeClipboard = r0
        La:
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.nativeClipboard
            return r0
    }

    public org.apache.harmony.awt.datatransfer.NativeClipboard getNativeSelection() {
            r1 = this;
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.nativeSelection
            if (r0 != 0) goto La
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.newNativeSelection()
            r1.nativeSelection = r0
        La:
            org.apache.harmony.awt.datatransfer.NativeClipboard r0 = r1.nativeSelection
            return r0
    }

    public synchronized java.awt.datatransfer.SystemFlavorMap getSystemFlavorMap() {
            r1 = this;
            monitor-enter(r1)
            java.awt.datatransfer.SystemFlavorMap r0 = r1.systemFlavorMap     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public abstract void initDragAndDrop();

    public void initSystemFlavorMap(java.awt.datatransfer.SystemFlavorMap r4) {
            r3 = this;
            java.lang.String[] r0 = r3.getCharsets()
            java.awt.datatransfer.DataFlavor r1 = java.awt.datatransfer.DataFlavor.stringFlavor
            java.lang.String r2 = "text/plain"
            r3.appendSystemFlavorMap(r4, r1, r2)
            java.lang.String r1 = "plain"
            r3.appendSystemFlavorMap(r4, r0, r1, r2)
            java.lang.String r1 = "html"
            java.lang.String r2 = "text/html"
            r3.appendSystemFlavorMap(r4, r0, r1, r2)
            java.awt.datatransfer.DataFlavor r1 = org.apache.harmony.awt.datatransfer.DataProvider.urlFlavor
            java.lang.String r2 = "application/x-java-url"
            r3.appendSystemFlavorMap(r4, r1, r2)
            java.lang.String r1 = "uri-list"
            r3.appendSystemFlavorMap(r4, r0, r1, r2)
            java.awt.datatransfer.DataFlavor r0 = java.awt.datatransfer.DataFlavor.javaFileListFlavor
            java.lang.String r1 = "application/x-java-file-list"
            r3.appendSystemFlavorMap(r4, r0, r1)
            java.awt.datatransfer.DataFlavor r0 = java.awt.datatransfer.DataFlavor.imageFlavor
            java.lang.String r1 = "image/x-java-image"
            r3.appendSystemFlavorMap(r4, r0, r1)
            return
    }

    protected abstract org.apache.harmony.awt.datatransfer.NativeClipboard newNativeClipboard();

    protected abstract org.apache.harmony.awt.datatransfer.NativeClipboard newNativeSelection();

    public abstract void runEventLoop();

    public synchronized void setSystemFlavorMap(java.awt.datatransfer.SystemFlavorMap r1) {
            r0 = this;
            monitor-enter(r0)
            r0.systemFlavorMap = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }
}

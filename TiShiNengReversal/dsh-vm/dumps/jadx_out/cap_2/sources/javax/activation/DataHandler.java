package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DataHandler implements myjava.awt.datatransfer.Transferable {
    private static final myjava.awt.datatransfer.DataFlavor[] emptyFlavors = null;
    private static javax.activation.DataContentHandlerFactory factory;
    private javax.activation.CommandMap currentCommandMap;
    private javax.activation.DataContentHandler dataContentHandler;
    private javax.activation.DataSource dataSource;
    private javax.activation.DataContentHandler factoryDCH;
    private javax.activation.DataSource objDataSource;
    private java.lang.Object object;
    private java.lang.String objectMimeType;
    private javax.activation.DataContentHandlerFactory oldFactory;
    private java.lang.String shortType;
    private myjava.awt.datatransfer.DataFlavor[] transferFlavors;


    static {
            r0 = 0
            myjava.awt.datatransfer.DataFlavor[] r0 = new myjava.awt.datatransfer.DataFlavor[r0]
            javax.activation.DataHandler.emptyFlavors = r0
            return
    }

    public DataHandler(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.dataSource = r0
            r2.objDataSource = r0
            r2.currentCommandMap = r0
            myjava.awt.datatransfer.DataFlavor[] r1 = javax.activation.DataHandler.emptyFlavors
            r2.transferFlavors = r1
            r2.dataContentHandler = r0
            r2.factoryDCH = r0
            r2.shortType = r0
            r2.object = r3
            r2.objectMimeType = r4
            javax.activation.DataContentHandlerFactory r3 = javax.activation.DataHandler.factory
            r2.oldFactory = r3
            return
    }

    public DataHandler(java.net.URL r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.dataSource = r0
            r2.objDataSource = r0
            r2.object = r0
            r2.objectMimeType = r0
            r2.currentCommandMap = r0
            myjava.awt.datatransfer.DataFlavor[] r1 = javax.activation.DataHandler.emptyFlavors
            r2.transferFlavors = r1
            r2.dataContentHandler = r0
            r2.factoryDCH = r0
            r2.oldFactory = r0
            r2.shortType = r0
            javax.activation.URLDataSource r0 = new javax.activation.URLDataSource
            r0.<init>(r3)
            r2.dataSource = r0
            javax.activation.DataContentHandlerFactory r3 = javax.activation.DataHandler.factory
            r2.oldFactory = r3
            return
    }

    public DataHandler(javax.activation.DataSource r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.objDataSource = r0
            r2.object = r0
            r2.objectMimeType = r0
            r2.currentCommandMap = r0
            myjava.awt.datatransfer.DataFlavor[] r1 = javax.activation.DataHandler.emptyFlavors
            r2.transferFlavors = r1
            r2.dataContentHandler = r0
            r2.factoryDCH = r0
            r2.shortType = r0
            r2.dataSource = r3
            javax.activation.DataContentHandlerFactory r3 = javax.activation.DataHandler.factory
            r2.oldFactory = r3
            return
    }

    static /* synthetic */ java.lang.Object access$0(javax.activation.DataHandler r0) {
            java.lang.Object r0 = r0.object
            return r0
    }

    static /* synthetic */ java.lang.String access$1(javax.activation.DataHandler r0) {
            java.lang.String r0 = r0.objectMimeType
            return r0
    }

    private synchronized java.lang.String getBaseType() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.shortType     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.getContentType()     // Catch: java.lang.Throwable -> L15
            javax.activation.MimeType r1 = new javax.activation.MimeType     // Catch: java.lang.Throwable -> L15 javax.activation.MimeTypeParseException -> L17
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15 javax.activation.MimeTypeParseException -> L17
            java.lang.String r1 = r1.getBaseType()     // Catch: java.lang.Throwable -> L15 javax.activation.MimeTypeParseException -> L17
            r2.shortType = r1     // Catch: java.lang.Throwable -> L15 javax.activation.MimeTypeParseException -> L17
            goto L19
        L15:
            r0 = move-exception
            goto L1d
        L17:
            r2.shortType = r0     // Catch: java.lang.Throwable -> L15
        L19:
            java.lang.String r0 = r2.shortType     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private synchronized javax.activation.CommandMap getCommandMap() {
            r1 = this;
            monitor-enter(r1)
            javax.activation.CommandMap r0 = r1.currentCommandMap     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r0
        L7:
            javax.activation.CommandMap r0 = javax.activation.CommandMap.getDefaultCommandMap()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    private synchronized javax.activation.DataContentHandler getDataContentHandler() {
            r4 = this;
            monitor-enter(r4)
            javax.activation.DataContentHandlerFactory r0 = javax.activation.DataHandler.factory     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandlerFactory r1 = r4.oldFactory     // Catch: java.lang.Throwable -> L13
            if (r0 == r1) goto L15
            r4.oldFactory = r0     // Catch: java.lang.Throwable -> L13
            r0 = 0
            r4.factoryDCH = r0     // Catch: java.lang.Throwable -> L13
            r4.dataContentHandler = r0     // Catch: java.lang.Throwable -> L13
            myjava.awt.datatransfer.DataFlavor[] r0 = javax.activation.DataHandler.emptyFlavors     // Catch: java.lang.Throwable -> L13
            r4.transferFlavors = r0     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L71
        L15:
            javax.activation.DataContentHandler r0 = r4.dataContentHandler     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L1b
            monitor-exit(r4)
            return r0
        L1b:
            java.lang.String r0 = r4.getBaseType()     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandler r1 = r4.factoryDCH     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L2d
            javax.activation.DataContentHandlerFactory r1 = javax.activation.DataHandler.factory     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L2d
            javax.activation.DataContentHandler r1 = r1.createDataContentHandler(r0)     // Catch: java.lang.Throwable -> L13
            r4.factoryDCH = r1     // Catch: java.lang.Throwable -> L13
        L2d:
            javax.activation.DataContentHandler r1 = r4.factoryDCH     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L33
            r4.dataContentHandler = r1     // Catch: java.lang.Throwable -> L13
        L33:
            javax.activation.DataContentHandler r1 = r4.dataContentHandler     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L52
            javax.activation.DataSource r1 = r4.dataSource     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L48
            javax.activation.CommandMap r1 = r4.getCommandMap()     // Catch: java.lang.Throwable -> L13
            javax.activation.DataSource r2 = r4.dataSource     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandler r0 = r1.createDataContentHandler(r0, r2)     // Catch: java.lang.Throwable -> L13
            r4.dataContentHandler = r0     // Catch: java.lang.Throwable -> L13
            goto L52
        L48:
            javax.activation.CommandMap r1 = r4.getCommandMap()     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandler r0 = r1.createDataContentHandler(r0)     // Catch: java.lang.Throwable -> L13
            r4.dataContentHandler = r0     // Catch: java.lang.Throwable -> L13
        L52:
            javax.activation.DataSource r0 = r4.dataSource     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L60
            javax.activation.DataSourceDataContentHandler r1 = new javax.activation.DataSourceDataContentHandler     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandler r2 = r4.dataContentHandler     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L13
            r4.dataContentHandler = r1     // Catch: java.lang.Throwable -> L13
            goto L6d
        L60:
            javax.activation.ObjectDataContentHandler r0 = new javax.activation.ObjectDataContentHandler     // Catch: java.lang.Throwable -> L13
            javax.activation.DataContentHandler r1 = r4.dataContentHandler     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r4.object     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r4.objectMimeType     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L13
            r4.dataContentHandler = r0     // Catch: java.lang.Throwable -> L13
        L6d:
            javax.activation.DataContentHandler r0 = r4.dataContentHandler     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)
            return r0
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    public static synchronized void setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory r4) {
            java.lang.Class<javax.activation.DataHandler> r0 = javax.activation.DataHandler.class
            monitor-enter(r0)
            javax.activation.DataContentHandlerFactory r1 = javax.activation.DataHandler.factory     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L2a
            java.lang.SecurityManager r1 = java.lang.System.getSecurityManager()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L26
            r1.checkSetFactory()     // Catch: java.lang.Throwable -> L11 java.lang.SecurityException -> L13
            goto L26
        L11:
            r4 = move-exception
            goto L32
        L13:
            r1 = move-exception
            java.lang.Class<javax.activation.DataHandler> r2 = javax.activation.DataHandler.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L11
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L11
            if (r2 != r3) goto L25
            goto L26
        L25:
            throw r1     // Catch: java.lang.Throwable -> L11
        L26:
            javax.activation.DataHandler.factory = r4     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L2a:
            java.lang.Error r4 = new java.lang.Error     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "DataContentHandlerFactory already defined"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public javax.activation.CommandInfo[] getAllCommands() {
            r3 = this;
            javax.activation.DataSource r0 = r3.dataSource
            if (r0 == 0) goto L13
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.DataSource r2 = r3.dataSource
            javax.activation.CommandInfo[] r0 = r0.getAllCommands(r1, r2)
            return r0
        L13:
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.CommandInfo[] r0 = r0.getAllCommands(r1)
            return r0
    }

    public java.lang.Object getBean(javax.activation.CommandInfo r2) {
            r1 = this;
            java.lang.ClassLoader r0 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L13
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L13
        Le:
            java.lang.Object r2 = r2.getCommandObject(r1, r0)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    public javax.activation.CommandInfo getCommand(java.lang.String r4) {
            r3 = this;
            javax.activation.DataSource r0 = r3.dataSource
            if (r0 == 0) goto L13
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.DataSource r2 = r3.dataSource
            javax.activation.CommandInfo r4 = r0.getCommand(r1, r4, r2)
            return r4
        L13:
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.CommandInfo r4 = r0.getCommand(r1, r4)
            return r4
    }

    public java.lang.Object getContent() throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.object
            if (r0 == 0) goto L5
            return r0
        L5:
            javax.activation.DataContentHandler r0 = r2.getDataContentHandler()
            javax.activation.DataSource r1 = r2.getDataSource()
            java.lang.Object r0 = r0.getContent(r1)
            return r0
    }

    public java.lang.String getContentType() {
            r1 = this;
            javax.activation.DataSource r0 = r1.dataSource
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getContentType()
            return r0
        L9:
            java.lang.String r0 = r1.objectMimeType
            return r0
    }

    public javax.activation.DataSource getDataSource() {
            r1 = this;
            javax.activation.DataSource r0 = r1.dataSource
            if (r0 != 0) goto L11
            javax.activation.DataSource r0 = r1.objDataSource
            if (r0 != 0) goto Lf
            javax.activation.DataHandlerDataSource r0 = new javax.activation.DataHandlerDataSource
            r0.<init>(r1)
            r1.objDataSource = r0
        Lf:
            javax.activation.DataSource r0 = r1.objDataSource
        L11:
            return r0
    }

    public java.io.InputStream getInputStream() throws java.io.IOException {
            r5 = this;
            javax.activation.DataSource r0 = r5.dataSource
            if (r0 == 0) goto L9
            java.io.InputStream r0 = r0.getInputStream()
            return r0
        L9:
            javax.activation.DataContentHandler r0 = r5.getDataContentHandler()
            if (r0 == 0) goto L4f
            boolean r1 = r0 instanceof javax.activation.ObjectDataContentHandler
            if (r1 == 0) goto L35
            r1 = r0
            javax.activation.ObjectDataContentHandler r1 = (javax.activation.ObjectDataContentHandler) r1
            javax.activation.DataContentHandler r1 = r1.getDCH()
            if (r1 == 0) goto L1d
            goto L35
        L1d:
            javax.activation.UnsupportedDataTypeException r0 = new javax.activation.UnsupportedDataTypeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no object DCH for MIME type "
            r1.<init>(r2)
            java.lang.String r2 = r5.getBaseType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L35:
            java.io.PipedOutputStream r1 = new java.io.PipedOutputStream
            r1.<init>()
            java.io.PipedInputStream r2 = new java.io.PipedInputStream
            r2.<init>(r1)
            java.lang.Thread r3 = new java.lang.Thread
            javax.activation.DataHandler$1 r4 = new javax.activation.DataHandler$1
            r4.<init>(r5, r1, r0)
            java.lang.String r0 = "DataHandler.getInputStream"
            r3.<init>(r4, r0)
            r3.start()
            return r2
        L4f:
            javax.activation.UnsupportedDataTypeException r0 = new javax.activation.UnsupportedDataTypeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no DCH for MIME type "
            r1.<init>(r2)
            java.lang.String r2 = r5.getBaseType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getName() {
            r1 = this;
            javax.activation.DataSource r0 = r1.dataSource
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getName()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r1 = this;
            javax.activation.DataSource r0 = r1.dataSource
            if (r0 == 0) goto L9
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public javax.activation.CommandInfo[] getPreferredCommands() {
            r3 = this;
            javax.activation.DataSource r0 = r3.dataSource
            if (r0 == 0) goto L13
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.DataSource r2 = r3.dataSource
            javax.activation.CommandInfo[] r0 = r0.getPreferredCommands(r1, r2)
            return r0
        L13:
            javax.activation.CommandMap r0 = r3.getCommandMap()
            java.lang.String r1 = r3.getBaseType()
            javax.activation.CommandInfo[] r0 = r0.getPreferredCommands(r1)
            return r0
    }

    @Override // myjava.awt.datatransfer.Transferable
    public java.lang.Object getTransferData(myjava.awt.datatransfer.DataFlavor r3) throws myjava.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
            r2 = this;
            javax.activation.DataContentHandler r0 = r2.getDataContentHandler()
            javax.activation.DataSource r1 = r2.dataSource
            java.lang.Object r3 = r0.getTransferData(r3, r1)
            return r3
    }

    @Override // myjava.awt.datatransfer.Transferable
    public synchronized myjava.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
            r2 = this;
            monitor-enter(r2)
            javax.activation.DataContentHandlerFactory r0 = javax.activation.DataHandler.factory     // Catch: java.lang.Throwable -> Lc
            javax.activation.DataContentHandlerFactory r1 = r2.oldFactory     // Catch: java.lang.Throwable -> Lc
            if (r0 == r1) goto Le
            myjava.awt.datatransfer.DataFlavor[] r0 = javax.activation.DataHandler.emptyFlavors     // Catch: java.lang.Throwable -> Lc
            r2.transferFlavors = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L22
        Le:
            myjava.awt.datatransfer.DataFlavor[] r0 = r2.transferFlavors     // Catch: java.lang.Throwable -> Lc
            myjava.awt.datatransfer.DataFlavor[] r1 = javax.activation.DataHandler.emptyFlavors     // Catch: java.lang.Throwable -> Lc
            if (r0 != r1) goto L1e
            javax.activation.DataContentHandler r0 = r2.getDataContentHandler()     // Catch: java.lang.Throwable -> Lc
            myjava.awt.datatransfer.DataFlavor[] r0 = r0.getTransferDataFlavors()     // Catch: java.lang.Throwable -> Lc
            r2.transferFlavors = r0     // Catch: java.lang.Throwable -> Lc
        L1e:
            myjava.awt.datatransfer.DataFlavor[] r0 = r2.transferFlavors     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // myjava.awt.datatransfer.Transferable
    public boolean isDataFlavorSupported(myjava.awt.datatransfer.DataFlavor r5) {
            r4 = this;
            myjava.awt.datatransfer.DataFlavor[] r0 = r4.getTransferDataFlavors()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.length
            if (r2 < r3) goto La
            return r1
        La:
            r3 = r0[r2]
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L14
            r5 = 1
            return r5
        L14:
            int r2 = r2 + 1
            goto L6
    }

    public synchronized void setCommandMap(javax.activation.CommandMap r2) {
            r1 = this;
            monitor-enter(r1)
            javax.activation.CommandMap r0 = r1.currentCommandMap     // Catch: java.lang.Throwable -> L12
            if (r2 != r0) goto L7
            if (r2 != 0) goto L10
        L7:
            myjava.awt.datatransfer.DataFlavor[] r0 = javax.activation.DataHandler.emptyFlavors     // Catch: java.lang.Throwable -> L12
            r1.transferFlavors = r0     // Catch: java.lang.Throwable -> L12
            r0 = 0
            r1.dataContentHandler = r0     // Catch: java.lang.Throwable -> L12
            r1.currentCommandMap = r2     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public void writeTo(java.io.OutputStream r5) throws java.io.IOException {
            r4 = this;
            javax.activation.DataSource r0 = r4.dataSource
            if (r0 == 0) goto L20
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            java.io.InputStream r0 = r0.getInputStream()
        Lc:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 > 0) goto L16
            r0.close()
            return
        L16:
            r3 = 0
            r5.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lc
        L1b:
            r5 = move-exception
            r0.close()
            throw r5
        L20:
            javax.activation.DataContentHandler r0 = r4.getDataContentHandler()
            java.lang.Object r1 = r4.object
            java.lang.String r2 = r4.objectMimeType
            r0.writeTo(r1, r2, r5)
            return
    }
}

package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final io.netty.handler.codec.xml.XmlDocumentEnd XML_DOCUMENT_END = null;
    private static final com.fasterxml.aalto.AsyncXMLInputFactory XML_INPUT_FACTORY = null;
    private final com.fasterxml.aalto.AsyncByteArrayFeeder streamFeeder;
    private final com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> streamReader;

    static {
            com.fasterxml.aalto.stax.InputFactoryImpl r0 = new com.fasterxml.aalto.stax.InputFactoryImpl
            r0.<init>()
            io.netty.handler.codec.xml.XmlDecoder.XML_INPUT_FACTORY = r0
            io.netty.handler.codec.xml.XmlDocumentEnd r0 = io.netty.handler.codec.xml.XmlDocumentEnd.INSTANCE
            io.netty.handler.codec.xml.XmlDecoder.XML_DOCUMENT_END = r0
            return
    }

    public XmlDecoder() {
            r1 = this;
            r1.<init>()
            com.fasterxml.aalto.AsyncXMLInputFactory r0 = io.netty.handler.codec.xml.XmlDecoder.XML_INPUT_FACTORY
            com.fasterxml.aalto.AsyncXMLStreamReader r0 = r0.createAsyncForByteArray()
            r1.streamReader = r0
            com.fasterxml.aalto.AsyncInputFeeder r0 = r0.getInputFeeder()
            com.fasterxml.aalto.AsyncByteArrayFeeder r0 = (com.fasterxml.aalto.AsyncByteArrayFeeder) r0
            r1.streamFeeder = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r10, io.netty.buffer.ByteBuf r11, java.util.List<java.lang.Object> r12) throws java.lang.Exception {
            r9 = this;
            int r10 = r11.readableBytes()
            byte[] r0 = new byte[r10]
            r11.readBytes(r0)
            com.fasterxml.aalto.AsyncByteArrayFeeder r1 = r9.streamFeeder     // Catch: javax.xml.stream.XMLStreamException -> L17f
            r2 = 0
            r1.feedInput(r0, r2, r10)     // Catch: javax.xml.stream.XMLStreamException -> L17f
        Lf:
            com.fasterxml.aalto.AsyncByteArrayFeeder r10 = r9.streamFeeder
            boolean r10 = r10.needMoreInput()
            if (r10 != 0) goto L17e
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r10 = r9.streamReader
            int r10 = r10.next()
            switch(r10) {
                case 1: goto L104;
                case 2: goto Lc0;
                case 3: goto Laa;
                case 4: goto L9a;
                case 5: goto L8a;
                case 6: goto L7b;
                case 7: goto L5a;
                case 8: goto L54;
                case 9: goto L3f;
                case 10: goto L20;
                case 11: goto L30;
                case 12: goto L21;
                default: goto L20;
            }
        L20:
            goto Lf
        L21:
            io.netty.handler.codec.xml.XmlCdata r10 = new io.netty.handler.codec.xml.XmlCdata
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getText()
            r10.<init>(r11)
            r12.add(r10)
            goto Lf
        L30:
            io.netty.handler.codec.xml.XmlDTD r10 = new io.netty.handler.codec.xml.XmlDTD
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getText()
            r10.<init>(r11)
            r12.add(r10)
            goto Lf
        L3f:
            io.netty.handler.codec.xml.XmlEntityReference r10 = new io.netty.handler.codec.xml.XmlEntityReference
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getLocalName()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r0 = r0.getText()
            r10.<init>(r11, r0)
            r12.add(r10)
            goto Lf
        L54:
            io.netty.handler.codec.xml.XmlDocumentEnd r10 = io.netty.handler.codec.xml.XmlDecoder.XML_DOCUMENT_END
            r12.add(r10)
            goto Lf
        L5a:
            io.netty.handler.codec.xml.XmlDocumentStart r10 = new io.netty.handler.codec.xml.XmlDocumentStart
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getEncoding()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r0 = r0.getVersion()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r1 = r9.streamReader
            boolean r1 = r1.isStandalone()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r3 = r9.streamReader
            java.lang.String r3 = r3.getCharacterEncodingScheme()
            r10.<init>(r11, r0, r1, r3)
            r12.add(r10)
            goto Lf
        L7b:
            io.netty.handler.codec.xml.XmlSpace r10 = new io.netty.handler.codec.xml.XmlSpace
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getText()
            r10.<init>(r11)
            r12.add(r10)
            goto Lf
        L8a:
            io.netty.handler.codec.xml.XmlComment r10 = new io.netty.handler.codec.xml.XmlComment
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getText()
            r10.<init>(r11)
            r12.add(r10)
            goto Lf
        L9a:
            io.netty.handler.codec.xml.XmlCharacters r10 = new io.netty.handler.codec.xml.XmlCharacters
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getText()
            r10.<init>(r11)
            r12.add(r10)
            goto Lf
        Laa:
            io.netty.handler.codec.xml.XmlProcessingInstruction r10 = new io.netty.handler.codec.xml.XmlProcessingInstruction
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getPIData()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r0 = r0.getPITarget()
            r10.<init>(r11, r0)
            r12.add(r10)
            goto Lf
        Lc0:
            io.netty.handler.codec.xml.XmlElementEnd r10 = new io.netty.handler.codec.xml.XmlElementEnd
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getLocalName()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            javax.xml.namespace.QName r0 = r0.getName()
            java.lang.String r0 = r0.getNamespaceURI()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r1 = r9.streamReader
            java.lang.String r1 = r1.getPrefix()
            r10.<init>(r11, r0, r1)
            r11 = 0
        Ldc:
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            int r0 = r0.getNamespaceCount()
            if (r11 >= r0) goto Lff
            io.netty.handler.codec.xml.XmlNamespace r0 = new io.netty.handler.codec.xml.XmlNamespace
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r1 = r9.streamReader
            java.lang.String r1 = r1.getNamespacePrefix(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r3 = r9.streamReader
            java.lang.String r3 = r3.getNamespaceURI(r11)
            r0.<init>(r1, r3)
            java.util.List r1 = r10.namespaces()
            r1.add(r0)
            int r11 = r11 + 1
            goto Ldc
        Lff:
            r12.add(r10)
            goto Lf
        L104:
            io.netty.handler.codec.xml.XmlElementStart r10 = new io.netty.handler.codec.xml.XmlElementStart
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r11 = r9.streamReader
            java.lang.String r11 = r11.getLocalName()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            javax.xml.namespace.QName r0 = r0.getName()
            java.lang.String r0 = r0.getNamespaceURI()
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r1 = r9.streamReader
            java.lang.String r1 = r1.getPrefix()
            r10.<init>(r11, r0, r1)
            r11 = 0
        L120:
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            int r0 = r0.getAttributeCount()
            if (r11 >= r0) goto L155
            io.netty.handler.codec.xml.XmlAttribute r3 = new io.netty.handler.codec.xml.XmlAttribute
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r4 = r0.getAttributeType(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r5 = r0.getAttributeLocalName(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r6 = r0.getAttributePrefix(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r7 = r0.getAttributeNamespace(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            java.lang.String r8 = r0.getAttributeValue(r11)
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.List r0 = r10.attributes()
            r0.add(r3)
            int r11 = r11 + 1
            goto L120
        L155:
            r11 = 0
        L156:
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r0 = r9.streamReader
            int r0 = r0.getNamespaceCount()
            if (r11 >= r0) goto L179
            io.netty.handler.codec.xml.XmlNamespace r0 = new io.netty.handler.codec.xml.XmlNamespace
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r1 = r9.streamReader
            java.lang.String r1 = r1.getNamespacePrefix(r11)
            com.fasterxml.aalto.AsyncXMLStreamReader<com.fasterxml.aalto.AsyncByteArrayFeeder> r3 = r9.streamReader
            java.lang.String r3 = r3.getNamespaceURI(r11)
            r0.<init>(r1, r3)
            java.util.List r1 = r10.namespaces()
            r1.add(r0)
            int r11 = r11 + 1
            goto L156
        L179:
            r12.add(r10)
            goto Lf
        L17e:
            return
        L17f:
            r0 = move-exception
            r10 = r0
            int r12 = r11.readableBytes()
            r11.skipBytes(r12)
            throw r10
    }
}

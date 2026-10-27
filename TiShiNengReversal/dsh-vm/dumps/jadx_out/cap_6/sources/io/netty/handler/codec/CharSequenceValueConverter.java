package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CharSequenceValueConverter implements io.netty.handler.codec.ValueConverter<java.lang.CharSequence> {
    public static final io.netty.handler.codec.CharSequenceValueConverter INSTANCE = null;
    private static final io.netty.util.AsciiString TRUE_ASCII = null;

    static {
            io.netty.handler.codec.CharSequenceValueConverter r0 = new io.netty.handler.codec.CharSequenceValueConverter
            r0.<init>()
            io.netty.handler.codec.CharSequenceValueConverter.INSTANCE = r0
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            java.lang.String r1 = "true"
            r0.<init>(r1)
            io.netty.handler.codec.CharSequenceValueConverter.TRUE_ASCII = r0
            return
    }

    public CharSequenceValueConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertBoolean(boolean r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertBoolean(boolean r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertBoolean(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertByte(byte r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertByte(byte r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertByte(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertChar(char r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertChar(char r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertChar(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertDouble(double r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertDouble(double r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertDouble(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertFloat(float r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertFloat(float r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertFloat(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertInt(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertInt(int r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertInt(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertLong(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertLong(long r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertLong(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertObject(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
        L7:
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertObject(java.lang.Object r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertObject(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertShort(short r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertShort(short r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertShort(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.ValueConverter
    public java.lang.CharSequence convertTimeMillis(long r2) {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = io.netty.handler.codec.DateFormatter.format(r0)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ java.lang.CharSequence convertTimeMillis(long r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.convertTimeMillis(r1)
            return r1
    }

    /* renamed from: convertToBoolean, reason: avoid collision after fix types in other method */
    public boolean convertToBoolean2(java.lang.CharSequence r2) {
            r1 = this;
            io.netty.util.AsciiString r0 = io.netty.handler.codec.CharSequenceValueConverter.TRUE_ASCII
            boolean r2 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r2, r0)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ boolean convertToBoolean(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r0.convertToBoolean2(r1)
            return r1
    }

    /* renamed from: convertToByte, reason: avoid collision after fix types in other method */
    public byte convertToByte2(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L13
            int r0 = r3.length()
            r1 = 1
            if (r0 != r1) goto L13
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            r0 = 0
            byte r3 = r3.byteAt(r0)
            return r3
        L13:
            java.lang.String r3 = r3.toString()
            byte r3 = java.lang.Byte.parseByte(r3)
            return r3
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ byte convertToByte(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            byte r1 = r0.convertToByte2(r1)
            return r1
    }

    /* renamed from: convertToChar, reason: avoid collision after fix types in other method */
    public char convertToChar2(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            char r2 = r2.charAt(r0)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ char convertToChar(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r1 = r0.convertToChar2(r1)
            return r1
    }

    /* renamed from: convertToDouble, reason: avoid collision after fix types in other method */
    public double convertToDouble2(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            double r0 = r3.parseDouble()
            return r0
        Lb:
            java.lang.String r3 = r3.toString()
            double r0 = java.lang.Double.parseDouble(r3)
            return r0
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ double convertToDouble(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            double r0 = r2.convertToDouble2(r3)
            return r0
    }

    /* renamed from: convertToFloat, reason: avoid collision after fix types in other method */
    public float convertToFloat2(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r2 = (io.netty.util.AsciiString) r2
            float r2 = r2.parseFloat()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            float r2 = java.lang.Float.parseFloat(r2)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ float convertToFloat(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            float r1 = r0.convertToFloat2(r1)
            return r1
    }

    /* renamed from: convertToInt, reason: avoid collision after fix types in other method */
    public int convertToInt2(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r2 = (io.netty.util.AsciiString) r2
            int r2 = r2.parseInt()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ int convertToInt(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r0.convertToInt2(r1)
            return r1
    }

    /* renamed from: convertToLong, reason: avoid collision after fix types in other method */
    public long convertToLong2(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            long r0 = r3.parseLong()
            return r0
        Lb:
            java.lang.String r3 = r3.toString()
            long r0 = java.lang.Long.parseLong(r3)
            return r0
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ long convertToLong(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            long r0 = r2.convertToLong2(r3)
            return r0
    }

    /* renamed from: convertToShort, reason: avoid collision after fix types in other method */
    public short convertToShort2(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto Lb
            io.netty.util.AsciiString r2 = (io.netty.util.AsciiString) r2
            short r2 = r2.parseShort()
            return r2
        Lb:
            java.lang.String r2 = r2.toString()
            short r2 = java.lang.Short.parseShort(r2)
            return r2
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ short convertToShort(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            short r1 = r0.convertToShort2(r1)
            return r1
    }

    /* renamed from: convertToTimeMillis, reason: avoid collision after fix types in other method */
    public long convertToTimeMillis2(java.lang.CharSequence r4) {
            r3 = this;
            java.util.Date r0 = io.netty.handler.codec.DateFormatter.parseHttpDate(r4)
            if (r0 != 0) goto L23
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "header can't be parsed into a Date: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 0
            r0.<init>(r4, r1)
            io.netty.util.internal.PlatformDependent.throwException(r0)
            r0 = 0
            return r0
        L23:
            long r0 = r0.getTime()
            return r0
    }

    @Override // io.netty.handler.codec.ValueConverter
    public /* bridge */ /* synthetic */ long convertToTimeMillis(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            long r0 = r2.convertToTimeMillis2(r3)
            return r0
    }
}

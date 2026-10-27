package androidx.exifinterface.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    static final java.nio.charset.Charset ASCII = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    public static final int[] BITS_PER_SAMPLE_RGB = null;
    static final short BYTE_ALIGN_II = 18761;
    static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = null;
    private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = null;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final boolean DEBUG = false;
    static final byte[] EXIF_ASCII_PREFIX = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] EXIF_POINTER_TAGS = null;
    static final androidx.exifinterface.media.ExifInterface.ExifTag[][] EXIF_TAGS = null;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    private static final java.util.List<java.lang.Integer> FLIPPED_ROTATION_ORDER = null;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final java.lang.String GPS_DIRECTION_MAGNETIC = "M";
    public static final java.lang.String GPS_DIRECTION_TRUE = "T";
    public static final java.lang.String GPS_DISTANCE_KILOMETERS = "K";
    public static final java.lang.String GPS_DISTANCE_MILES = "M";
    public static final java.lang.String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final java.lang.String GPS_MEASUREMENT_2D = "2";
    public static final java.lang.String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final java.lang.String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final java.lang.String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final java.lang.String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final java.lang.String GPS_SPEED_KNOTS = "N";
    public static final java.lang.String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = null;
    private static final byte[] HEIF_BRAND_HEIC = null;
    private static final byte[] HEIF_BRAND_MIF1 = null;
    private static final byte[] HEIF_TYPE_FTYP = null;
    static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final byte[] IDENTIFIER_XMP_APP1 = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_EXIF_TAGS = null;
    private static final int IFD_FORMAT_BYTE = 1;
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    static final java.lang.String[] IFD_FORMAT_NAMES = null;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_GPS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final int IFD_OFFSET = 8;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_THUMBNAIL_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_TIFF_TAGS = null;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    static final int IFD_TYPE_PREVIEW = 5;
    static final int IFD_TYPE_PRIMARY = 0;
    static final int IFD_TYPE_THUMBNAIL = 4;
    private static final int IMAGE_TYPE_ARW = 1;
    private static final int IMAGE_TYPE_CR2 = 2;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_HEIF = 12;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_NEF = 5;
    private static final int IMAGE_TYPE_NRW = 6;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_PNG = 13;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_SRW = 11;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final int IMAGE_TYPE_WEBP = 14;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_TAG = null;
    static final byte[] JPEG_SIGNATURE = null;
    public static final java.lang.String LATITUDE_NORTH = "N";
    public static final java.lang.String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final java.lang.String LONGITUDE_EAST = "E";
    public static final java.lang.String LONGITUDE_WEST = "W";
    static final byte MARKER = -1;
    static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOI = -40;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final java.util.regex.Pattern NON_ZERO_TIME_PATTERN = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_CAMERA_SETTINGS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_IMAGE_PROCESSING_TAGS = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = null;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = null;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_MAKER_NOTE_TAGS = null;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final java.lang.String PEF_SIGNATURE = "PENTAX";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] PEF_TAGS = null;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final byte[] PNG_CHUNK_TYPE_EXIF = null;
    private static final byte[] PNG_CHUNK_TYPE_IEND = null;
    private static final byte[] PNG_CHUNK_TYPE_IHDR = null;
    private static final byte[] PNG_SIGNATURE = null;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final java.lang.String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final java.util.List<java.lang.Integer> ROTATION_ORDER = null;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    static final byte START_CODE = 42;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    private static final java.lang.String TAG = "ExifInterface";
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @java.lang.Deprecated
    public static final java.lang.String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    private static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_GAMMA = "Gamma";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_ISO_SPEED = "ISOSpeed";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_LENS_MAKE = "LensMake";
    public static final java.lang.String TAG_LENS_MODEL = "LensModel";
    public static final java.lang.String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final java.lang.String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final java.lang.String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final java.lang.String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag TAG_RAF_IMAGE_SIZE = null;
    public static final java.lang.String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_XMP = "Xmp";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = null;
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = null;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = null;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_SIGNATURE_1 = null;
    private static final byte[] WEBP_SIGNATURE_2 = null;
    private static final byte WEBP_VP8L_SIGNATURE = 47;
    private static final byte[] WEBP_VP8_SIGNATURE = null;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap = null;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForReading = null;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForWriting = null;
    private static java.text.SimpleDateFormat sFormatterPrimary;
    private static java.text.SimpleDateFormat sFormatterSecondary;
    private static final java.util.HashSet<java.lang.String> sTagSetForCompatibility = null;
    private boolean mAreThumbnailStripsConsecutive;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] mAttributes;
    private java.util.Set<java.lang.Integer> mAttributesOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    private java.lang.String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private boolean mXmpIsFromSeparateMarker;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        private static final java.nio.ByteOrder BIG_ENDIAN = null;
        private static final java.nio.ByteOrder LITTLE_ENDIAN = null;
        private java.nio.ByteOrder mByteOrder;
        private java.io.DataInputStream mDataInputStream;
        final int mLength;
        int mPosition;

        static {
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN = r0
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN = r0
                return
        }

        public ByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.<init>(r2, r0)
                return
        }

        ByteOrderedDataInputStream(java.io.InputStream r2, java.nio.ByteOrder r3) throws java.io.IOException {
                r1 = this;
                r1.<init>()
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.mByteOrder = r0
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r2)
                r1.mDataInputStream = r0
                int r2 = r0.available()
                r1.mLength = r2
                r0 = 0
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                r0.mark(r2)
                r1.mByteOrder = r3
                return
        }

        public ByteOrderedDataInputStream(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r0.<init>(r2)
                r1.<init>(r0)
                return
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.available()
                return r0
        }

        public int getLength() {
                r1 = this;
                int r0 = r1.mLength
                return r0
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r2) {
                r1 = this;
                monitor-enter(r1)
                java.io.DataInputStream r0 = r1.mDataInputStream     // Catch: java.lang.Throwable -> L8
                r0.mark(r2)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)
                return
            L8:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r2
        }

        public int peek() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r2 = r0.read(r2, r3, r4)
                int r3 = r1.mPosition
                int r3 = r3 + r2
                r1.mPosition = r3
                return r2
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                boolean r0 = r0.readBoolean()
                return r0
        }

        @Override // java.io.DataInput
        public byte readByte() throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r0 = r0 + 1
                r2.mPosition = r0
                int r1 = r2.mLength
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.mDataInputStream
                int r0 = r0.read()
                if (r0 < 0) goto L14
                byte r0 = (byte) r0
                return r0
            L14:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L1a:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public char readChar() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                char r0 = r0.readChar()
                return r0
        }

        @Override // java.io.DataInput
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readLong()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // java.io.DataInput
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readInt()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.mPosition
                int r1 = r4.length
                int r0 = r0 + r1
                r3.mPosition = r0
                int r1 = r3.mLength
                if (r0 > r1) goto L1e
                java.io.DataInputStream r0 = r3.mDataInputStream
                r1 = 0
                int r2 = r4.length
                int r0 = r0.read(r4, r1, r2)
                int r4 = r4.length
                if (r0 != r4) goto L16
                return
            L16:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r0 = "Couldn't read up to the length of buffer"
                r4.<init>(r0)
                throw r4
            L1e:
                java.io.EOFException r4 = new java.io.EOFException
                r4.<init>()
                throw r4
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r0 = r0 + r5
                r2.mPosition = r0
                int r1 = r2.mLength
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.mDataInputStream
                int r3 = r0.read(r3, r4, r5)
                if (r3 != r5) goto L12
                return
            L12:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r4 = "Couldn't read up to the length of buffer"
                r3.<init>(r4)
                throw r3
            L1a:
                java.io.EOFException r3 = new java.io.EOFException
                r3.<init>()
                throw r3
        }

        @Override // java.io.DataInput
        public int readInt() throws java.io.IOException {
                r6 = this;
                int r0 = r6.mPosition
                int r0 = r0 + 4
                r6.mPosition = r0
                int r1 = r6.mLength
                if (r0 > r1) goto L65
                java.io.DataInputStream r0 = r6.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r2 = r2.read()
                java.io.DataInputStream r3 = r6.mDataInputStream
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r4 = r4 | r3
                if (r4 < 0) goto L5f
                java.nio.ByteOrder r4 = r6.mByteOrder
                java.nio.ByteOrder r5 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r4 != r5) goto L38
                int r3 = r3 << 24
                int r2 = r2 << 16
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L38:
                java.nio.ByteOrder r5 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r4 != r5) goto L46
                int r0 = r0 << 24
                int r1 = r1 << 16
                int r0 = r0 + r1
                int r1 = r2 << 8
                int r0 = r0 + r1
                int r0 = r0 + r3
                return r0
            L46:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r6.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5f:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L65:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readLine() throws java.io.IOException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.io.DataInput
        public long readLong() throws java.io.IOException {
                r19 = this;
                r0 = r19
                int r1 = r0.mPosition
                r2 = 8
                int r1 = r1 + r2
                r0.mPosition = r1
                int r3 = r0.mLength
                if (r1 > r3) goto Lb8
                java.io.DataInputStream r1 = r0.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r3 = r0.mDataInputStream
                int r3 = r3.read()
                java.io.DataInputStream r4 = r0.mDataInputStream
                int r4 = r4.read()
                java.io.DataInputStream r5 = r0.mDataInputStream
                int r5 = r5.read()
                java.io.DataInputStream r6 = r0.mDataInputStream
                int r6 = r6.read()
                java.io.DataInputStream r7 = r0.mDataInputStream
                int r7 = r7.read()
                java.io.DataInputStream r8 = r0.mDataInputStream
                int r8 = r8.read()
                java.io.DataInputStream r9 = r0.mDataInputStream
                int r9 = r9.read()
                r10 = r1 | r3
                r10 = r10 | r4
                r10 = r10 | r5
                r10 = r10 | r6
                r10 = r10 | r7
                r10 = r10 | r8
                r10 = r10 | r9
                if (r10 < 0) goto Lb2
                java.nio.ByteOrder r10 = r0.mByteOrder
                java.nio.ByteOrder r11 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                r14 = 32
                r15 = 40
                r16 = 48
                r17 = 56
                if (r10 != r11) goto L74
                long r9 = (long) r9
                long r9 = r9 << r17
                r11 = 16
                r18 = 24
                long r12 = (long) r8
                long r12 = r12 << r16
                long r9 = r9 + r12
                long r7 = (long) r7
                long r7 = r7 << r15
                long r9 = r9 + r7
                long r6 = (long) r6
                long r6 = r6 << r14
                long r9 = r9 + r6
                long r5 = (long) r5
                long r5 = r5 << r18
                long r9 = r9 + r5
                long r4 = (long) r4
                long r4 = r4 << r11
                long r9 = r9 + r4
                long r3 = (long) r3
                long r2 = r3 << r2
                long r9 = r9 + r2
                long r1 = (long) r1
                long r9 = r9 + r1
                return r9
            L74:
                r11 = 16
                r18 = 24
                java.nio.ByteOrder r12 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r10 != r12) goto L99
                long r12 = (long) r1
                long r12 = r12 << r17
                r1 = 8
                long r2 = (long) r3
                long r2 = r2 << r16
                long r12 = r12 + r2
                long r2 = (long) r4
                long r2 = r2 << r15
                long r12 = r12 + r2
                long r2 = (long) r5
                long r2 = r2 << r14
                long r12 = r12 + r2
                long r2 = (long) r6
                long r2 = r2 << r18
                long r12 = r12 + r2
                long r2 = (long) r7
                long r2 = r2 << r11
                long r12 = r12 + r2
                long r2 = (long) r8
                long r1 = r2 << r1
                long r12 = r12 + r1
                long r1 = (long) r9
                long r12 = r12 + r1
                return r12
            L99:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid byte order: "
                r2.append(r3)
                java.nio.ByteOrder r3 = r0.mByteOrder
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Lb2:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
            Lb8:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
        }

        @Override // java.io.DataInput
        public short readShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                int r1 = r4.mLength
                if (r0 > r1) goto L4d
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L47
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r2 != r3) goto L25
                int r1 = r1 << 8
                int r1 = r1 + r0
                short r0 = (short) r1
                return r0
            L25:
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r2 != r3) goto L2e
                int r0 = r0 << 8
                int r0 = r0 + r1
                short r0 = (short) r0
                return r0
            L2e:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L47:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L4d:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                java.lang.String r0 = r0.readUTF()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.readUnsignedByte()
                return r0
        }

        public long readUnsignedInt() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readInt()
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                int r1 = r4.mLength
                if (r0 > r1) goto L4b
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L45
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.LITTLE_ENDIAN
                if (r2 != r3) goto L24
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L24:
                java.nio.ByteOrder r3 = androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream.BIG_ENDIAN
                if (r2 != r3) goto L2c
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L2c:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L45:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L4b:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        public void seek(long r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                long r1 = (long) r0
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L17
                r0 = 0
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                r0.reset()
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r1 = r4.mLength
                r0.mark(r1)
                goto L19
            L17:
                long r0 = (long) r0
                long r5 = r5 - r0
            L19:
                int r6 = (int) r5
                int r5 = r4.skipBytes(r6)
                if (r5 != r6) goto L21
                return
            L21:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Couldn't seek up to the byteCount"
                r5.<init>(r6)
                throw r5
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.DataInput
        public int skipBytes(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.mLength
                int r1 = r3.mPosition
                int r0 = r0 - r1
                int r4 = java.lang.Math.min(r4, r0)
                r0 = 0
            La:
                if (r0 >= r4) goto L16
                java.io.DataInputStream r1 = r3.mDataInputStream
                int r2 = r4 - r0
                int r1 = r1.skipBytes(r2)
                int r0 = r0 + r1
                goto La
            L16:
                int r4 = r3.mPosition
                int r4 = r4 + r0
                r3.mPosition = r4
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
        private java.nio.ByteOrder mByteOrder;
        final java.io.OutputStream mOutputStream;

        public ByteOrderedDataOutputStream(java.io.OutputStream r1, java.nio.ByteOrder r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mOutputStream = r1
                r0.mByteOrder = r2
                return
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2, r3, r4)
                return
        }

        public void writeByte(int r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        public void writeInt(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L29
                java.io.OutputStream r0 = r2.mOutputStream
                r1 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 24
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                return
            L29:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L4f
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 24
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L4f:
                return
        }

        public void writeShort(short r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L17
                java.io.OutputStream r0 = r2.mOutputStream
                r1 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                return
            L17:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L2b
                java.io.OutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.mOutputStream
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L2b:
                return
        }

        public void writeUnsignedInt(long r1) throws java.io.IOException {
                r0 = this;
                int r2 = (int) r1
                r0.writeInt(r2)
                return
        }

        public void writeUnsignedShort(int r1) throws java.io.IOException {
                r0 = this;
                short r1 = (short) r1
                r0.writeShort(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        ExifAttribute(int r1, int r2, long r3, byte[] r5) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.numberOfComponents = r2
                r0.bytesOffset = r3
                r0.bytes = r5
                return
        }

        ExifAttribute(int r7, int r8, byte[] r9) {
                r6 = this;
                r3 = -1
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r5)
                return
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createByte(java.lang.String r5) {
                int r0 = r5.length()
                r1 = 1
                if (r0 != r1) goto L28
                r0 = 0
                char r2 = r5.charAt(r0)
                r3 = 48
                if (r2 < r3) goto L28
                char r2 = r5.charAt(r0)
                r4 = 49
                if (r2 > r4) goto L28
                char r5 = r5.charAt(r0)
                int r5 = r5 - r3
                byte r5 = (byte) r5
                byte[] r2 = new byte[r1]
                r2[r0] = r5
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                r5.<init>(r1, r1, r2)
                return r5
            L28:
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
                byte[] r5 = r5.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r2 = r5.length
                r0.<init>(r1, r2, r5)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double r2, java.nio.ByteOrder r4) {
                r0 = 1
                double[] r0 = new double[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createDouble(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 12
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L14:
                if (r2 >= r6) goto L1e
                r3 = r5[r2]
                r0.putDouble(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int r0, java.nio.ByteOrder r1) {
                int[] r0 = new int[]{r0}
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = createSLong(r0, r1)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 9
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L14:
                if (r2 >= r5) goto L1e
                r3 = r4[r2]
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.ExifInterface.Rational r2, java.nio.ByteOrder r3) {
                r0 = 1
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createSRational(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 10
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L14:
                if (r2 >= r7) goto L27
                r3 = r6[r2]
                long r4 = r3.numerator
                int r5 = (int) r4
                r0.putInt(r5)
                long r3 = r3.denominator
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L14
            L27:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createString(java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 0
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
                byte[] r3 = r3.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                r1 = 2
                int r2 = r3.length
                r0.<init>(r1, r2, r3)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long r2, java.nio.ByteOrder r4) {
                r0 = 1
                long[] r0 = new long[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createULong(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 4
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L13:
                if (r2 >= r6) goto L1e
                r3 = r5[r2]
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational r2, java.nio.ByteOrder r3) {
                r0 = 1
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createURational(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 5
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L13:
                if (r2 >= r7) goto L26
                r3 = r6[r2]
                long r4 = r3.numerator
                int r5 = (int) r4
                r0.putInt(r5)
                long r3 = r3.denominator
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L26:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int r0, java.nio.ByteOrder r1) {
                int[] r0 = new int[]{r0}
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = createUShort(r0, r1)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 3
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L13:
                if (r2 >= r5) goto L1e
                r3 = r4[r2]
                short r3 = (short) r3
                r0.putShort(r3)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public double getDoubleValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L6b
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                double r0 = java.lang.Double.parseDouble(r5)
                return r0
            L11:
                boolean r0 = r5 instanceof long[]
                java.lang.String r1 = "There are more than one component"
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r2]
                double r0 = (double) r0
                return r0
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3b
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L35
                r5 = r5[r2]
                double r0 = (double) r5
                return r0
            L35:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L3b:
                boolean r0 = r5 instanceof double[]
                if (r0 == 0) goto L4d
                double[] r5 = (double[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L47
                r0 = r5[r2]
                return r0
            L47:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L4d:
                boolean r0 = r5 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r0 == 0) goto L63
                androidx.exifinterface.media.ExifInterface$Rational[] r5 = (androidx.exifinterface.media.ExifInterface.Rational[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L5d
                r5 = r5[r2]
                double r0 = r5.calculate()
                return r0
            L5d:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L63:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a double value"
                r5.<init>(r0)
                throw r5
            L6b:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a double value"
                r5.<init>(r0)
                throw r5
        }

        public int getIntValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L42
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                return r5
            L11:
                boolean r0 = r5 instanceof long[]
                java.lang.String r1 = "There are more than one component"
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r2]
                int r5 = (int) r0
                return r5
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3a
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L34
                r5 = r5[r2]
                return r5
            L34:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L3a:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a integer value"
                r5.<init>(r0)
                throw r5
            L42:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a integer value"
                r5.<init>(r0)
                throw r5
        }

        public java.lang.String getStringValue(java.nio.ByteOrder r8) {
                r7 = this;
                java.lang.Object r8 = r7.getValue(r8)
                r0 = 0
                if (r8 != 0) goto L8
                return r0
            L8:
                boolean r1 = r8 instanceof java.lang.String
                if (r1 == 0) goto Lf
                java.lang.String r8 = (java.lang.String) r8
                return r8
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r8 instanceof long[]
                java.lang.String r3 = ","
                r4 = 0
                if (r2 == 0) goto L33
                long[] r8 = (long[]) r8
            L1d:
                int r0 = r8.length
                if (r4 >= r0) goto L2e
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L1d
                r1.append(r3)
                goto L1d
            L2e:
                java.lang.String r8 = r1.toString()
                return r8
            L33:
                boolean r2 = r8 instanceof int[]
                if (r2 == 0) goto L4f
                int[] r8 = (int[]) r8
            L39:
                int r0 = r8.length
                if (r4 >= r0) goto L4a
                r0 = r8[r4]
                r1.append(r0)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L39
                r1.append(r3)
                goto L39
            L4a:
                java.lang.String r8 = r1.toString()
                return r8
            L4f:
                boolean r2 = r8 instanceof double[]
                if (r2 == 0) goto L6b
                double[] r8 = (double[]) r8
            L55:
                int r0 = r8.length
                if (r4 >= r0) goto L66
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L55
                r1.append(r3)
                goto L55
            L66:
                java.lang.String r8 = r1.toString()
                return r8
            L6b:
                boolean r2 = r8 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r2 == 0) goto L95
                androidx.exifinterface.media.ExifInterface$Rational[] r8 = (androidx.exifinterface.media.ExifInterface.Rational[]) r8
            L71:
                int r0 = r8.length
                if (r4 >= r0) goto L90
                r0 = r8[r4]
                long r5 = r0.numerator
                r1.append(r5)
                r0 = 47
                r1.append(r0)
                r0 = r8[r4]
                long r5 = r0.denominator
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L71
                r1.append(r3)
                goto L71
            L90:
                java.lang.String r8 = r1.toString()
                return r8
            L95:
                return r0
        }

        java.lang.Object getValue(java.nio.ByteOrder r9) {
                r8 = this;
                r0 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L143 java.io.IOException -> L145
                byte[] r2 = r8.bytes     // Catch: java.lang.Throwable -> L143 java.io.IOException -> L145
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L143 java.io.IOException -> L145
                r1.setByteOrder(r9)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r9 = r8.format     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r2 = 0
                switch(r9) {
                    case 1: goto L11c;
                    case 2: goto Ld9;
                    case 3: goto Lc4;
                    case 4: goto Laf;
                    case 5: goto L91;
                    case 6: goto L11c;
                    case 7: goto Ld9;
                    case 8: goto L7c;
                    case 9: goto L67;
                    case 10: goto L47;
                    case 11: goto L31;
                    case 12: goto L15;
                    default: goto L11;
                }
            L11:
                r1.close()     // Catch: java.io.IOException -> L14
            L14:
                return r0
            L15:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                double[] r9 = new double[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L19:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L2d
                double r3 = r1.readDouble()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L19
            L26:
                r9 = move-exception
                r0 = r1
                goto L148
            L2a:
                goto L14e
            L2d:
                r1.close()     // Catch: java.io.IOException -> L30
            L30:
                return r9
            L31:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                double[] r9 = new double[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L35:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L43
                float r3 = r1.readFloat()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L35
            L43:
                r1.close()     // Catch: java.io.IOException -> L46
            L46:
                return r9
            L47:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                androidx.exifinterface.media.ExifInterface$Rational[] r9 = new androidx.exifinterface.media.ExifInterface.Rational[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L4b:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L63
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                androidx.exifinterface.media.ExifInterface$Rational r7 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r7     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L4b
            L63:
                r1.close()     // Catch: java.io.IOException -> L66
            L66:
                return r9
            L67:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int[] r9 = new int[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L6b:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L78
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L6b
            L78:
                r1.close()     // Catch: java.io.IOException -> L7b
            L7b:
                return r9
            L7c:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int[] r9 = new int[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L80:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L8d
                short r3 = r1.readShort()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L80
            L8d:
                r1.close()     // Catch: java.io.IOException -> L90
            L90:
                return r9
            L91:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                androidx.exifinterface.media.ExifInterface$Rational[] r9 = new androidx.exifinterface.media.ExifInterface.Rational[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L95:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto Lab
                long r3 = r1.readUnsignedInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                long r5 = r1.readUnsignedInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                androidx.exifinterface.media.ExifInterface$Rational r7 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r7     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto L95
            Lab:
                r1.close()     // Catch: java.io.IOException -> Lae
            Lae:
                return r9
            Laf:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                long[] r9 = new long[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            Lb3:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto Lc0
                long r3 = r1.readUnsignedInt()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto Lb3
            Lc0:
                r1.close()     // Catch: java.io.IOException -> Lc3
            Lc3:
                return r9
            Lc4:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int[] r9 = new int[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            Lc8:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto Ld5
                int r3 = r1.readUnsignedShort()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r2 = r2 + 1
                goto Lc8
            Ld5:
                r1.close()     // Catch: java.io.IOException -> Ld8
            Ld8:
                return r9
            Ld9:
                int r9 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                byte[] r3 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r3 = r3.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r9 < r3) goto Lf3
                r9 = 0
            Le1:
                byte[] r3 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r4 = r3.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r9 >= r4) goto Lf2
                byte[] r4 = r8.bytes     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r4 = r4[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r3 = r3[r9]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r4 == r3) goto Lef
                goto Lf3
            Lef:
                int r9 = r9 + 1
                goto Le1
            Lf2:
                int r2 = r3.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            Lf3:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9.<init>()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            Lf8:
                int r3 = r8.numberOfComponents     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r2 >= r3) goto L114
                byte[] r3 = r8.bytes     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r3 = r3[r2]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r3 != 0) goto L103
                goto L114
            L103:
                r4 = 32
                if (r3 < r4) goto L10c
                char r3 = (char) r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9.append(r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                goto L111
            L10c:
                r3 = 63
                r9.append(r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
            L111:
                int r2 = r2 + 1
                goto Lf8
            L114:
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r1.close()     // Catch: java.io.IOException -> L11b
            L11b:
                return r9
            L11c:
                byte[] r9 = r8.bytes     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r3 = r9.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r4 = 1
                if (r3 != r4) goto L138
                r3 = r9[r2]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                if (r3 < 0) goto L138
                if (r3 > r4) goto L138
                java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                int r3 = r3 + 48
                char r3 = (char) r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r4[r2] = r3     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r9.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r1.close()     // Catch: java.io.IOException -> L137
            L137:
                return r9
            L138:
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                java.nio.charset.Charset r3 = androidx.exifinterface.media.ExifInterface.ASCII     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2a
                r1.close()     // Catch: java.io.IOException -> L142
            L142:
                return r2
            L143:
                r9 = move-exception
                goto L148
            L145:
                r1 = r0
                goto L14e
            L148:
                if (r0 == 0) goto L14d
                r0.close()     // Catch: java.io.IOException -> L14d
            L14d:
                throw r9
            L14e:
                if (r1 == 0) goto L153
                r1.close()     // Catch: java.io.IOException -> L153
            L153:
                return r0
        }

        public int size() {
                r2 = this;
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                int r1 = r2.format
                r0 = r0[r1]
                int r1 = r2.numberOfComponents
                int r0 = r0 * r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "("
                r0.append(r1)
                java.lang.String[] r1 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
                int r2 = r3.format
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ", data length:"
                r0.append(r1)
                byte[] r1 = r3.bytes
                int r1 = r1.length
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ExifTag {
        public final java.lang.String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        ExifTag(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r1 = -1
                r0.secondaryFormat = r1
                return
        }

        ExifTag(java.lang.String r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r0.secondaryFormat = r4
                return
        }

        boolean isFormatCompatible(int r5) {
                r4 = this;
                int r0 = r4.primaryFormat
                r1 = 1
                r2 = 7
                if (r0 == r2) goto L31
                if (r5 != r2) goto L9
                goto L31
            L9:
                if (r0 == r5) goto L31
                int r2 = r4.secondaryFormat
                if (r2 != r5) goto L10
                goto L31
            L10:
                r3 = 4
                if (r0 == r3) goto L15
                if (r2 != r3) goto L19
            L15:
                r3 = 3
                if (r5 != r3) goto L19
                return r1
            L19:
                r3 = 9
                if (r0 == r3) goto L1f
                if (r2 != r3) goto L24
            L1f:
                r3 = 8
                if (r5 != r3) goto L24
                return r1
            L24:
                r3 = 12
                if (r0 == r3) goto L2a
                if (r2 != r3) goto L2f
            L2a:
                r0 = 11
                if (r5 != r0) goto L2f
                return r1
            L2f:
                r5 = 0
                return r5
            L31:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Rational {
        public final long denominator;
        public final long numerator;

        Rational(double r3) {
                r2 = this;
                r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r3 = r3 * r0
                long r3 = (long) r3
                r0 = 10000(0x2710, double:4.9407E-320)
                r2.<init>(r3, r0)
                return
        }

        Rational(long r4, long r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                r3.numerator = r0
                r4 = 1
                r3.denominator = r4
                return
            L10:
                r3.numerator = r4
                r3.denominator = r6
                return
        }

        public double calculate() {
                r4 = this;
                long r0 = r4.numerator
                double r0 = (double) r0
                long r2 = r4.denominator
                double r2 = (double) r2
                double r0 = r0 / r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.numerator
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                long r1 = r3.denominator
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "ExifInterface"
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            androidx.exifinterface.media.ExifInterface.DEBUG = r2
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 4
            java.lang.Integer[] r9 = new java.lang.Integer[r8]
            r10 = 0
            r9[r10] = r3
            r9[r2] = r5
            r5 = 2
            r9[r5] = r1
            r9[r0] = r7
            java.util.List r9 = java.util.Arrays.asList(r9)
            androidx.exifinterface.media.ExifInterface.ROTATION_ORDER = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11 = 7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r14 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r16 = 0
            java.lang.Integer[] r10 = new java.lang.Integer[r8]
            r10[r16] = r9
            r10[r2] = r12
            r10[r5] = r13
            r10[r0] = r15
            java.util.List r10 = java.util.Arrays.asList(r10)
            androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER = r10
            int[] r10 = new int[]{r6, r6, r6}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB = r10
            int[] r10 = new int[]{r8}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_1 = r10
            int[] r10 = new int[]{r6}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2 = r10
            byte[] r10 = new byte[r0]
            r10 = {x0ed4: FILL_ARRAY_DATA , data: [-1, -40, -1} // fill-array
            androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE = r10
            byte[] r10 = new byte[r8]
            r10 = {x0eda: FILL_ARRAY_DATA , data: [102, 116, 121, 112} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP = r10
            byte[] r10 = new byte[r8]
            r10 = {x0ee0: FILL_ARRAY_DATA , data: [109, 105, 102, 49} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1 = r10
            byte[] r10 = new byte[r8]
            r10 = {x0ee6: FILL_ARRAY_DATA , data: [104, 101, 105, 99} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC = r10
            byte[] r10 = new byte[r4]
            r10 = {x0eec: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1 = r10
            r10 = 10
            byte[] r13 = new byte[r10]
            r13 = {x0ef4: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 85, 83, 0, 73, 73} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2 = r13
            byte[] r13 = new byte[r6]
            r13 = {x0efe: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f06: FILL_ARRAY_DATA , data: [101, 88, 73, 102} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f0c: FILL_ARRAY_DATA , data: [73, 72, 68, 82} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f12: FILL_ARRAY_DATA , data: [73, 69, 78, 68} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f18: FILL_ARRAY_DATA , data: [82, 73, 70, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1 = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f1e: FILL_ARRAY_DATA , data: [87, 69, 66, 80} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2 = r13
            byte[] r13 = new byte[r8]
            r13 = {x0f24: FILL_ARRAY_DATA , data: [69, 88, 73, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF = r13
            byte[] r13 = new byte[r0]
            r13 = {x0f2a: FILL_ARRAY_DATA , data: [-99, 1, 42} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE = r13
            java.lang.String r13 = "VP8X"
            r17 = 10
            java.nio.charset.Charset r10 = java.nio.charset.Charset.defaultCharset()
            byte[] r10 = r13.getBytes(r10)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X = r10
            java.lang.String r10 = "VP8L"
            java.nio.charset.Charset r13 = java.nio.charset.Charset.defaultCharset()
            byte[] r10 = r10.getBytes(r13)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L = r10
            java.lang.String r10 = "VP8 "
            java.nio.charset.Charset r13 = java.nio.charset.Charset.defaultCharset()
            byte[] r10 = r10.getBytes(r13)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8 = r10
            java.lang.String r10 = "ANIM"
            java.nio.charset.Charset r13 = java.nio.charset.Charset.defaultCharset()
            byte[] r10 = r10.getBytes(r13)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM = r10
            java.lang.String r10 = "ANMF"
            java.nio.charset.Charset r13 = java.nio.charset.Charset.defaultCharset()
            byte[] r10 = r10.getBytes(r13)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF = r10
            java.lang.String r30 = "DOUBLE"
            java.lang.String r31 = "IFD"
            java.lang.String r18 = ""
            java.lang.String r19 = "BYTE"
            java.lang.String r20 = "STRING"
            java.lang.String r21 = "USHORT"
            java.lang.String r22 = "ULONG"
            java.lang.String r23 = "URATIONAL"
            java.lang.String r24 = "SBYTE"
            java.lang.String r25 = "UNDEFINED"
            java.lang.String r26 = "SSHORT"
            java.lang.String r27 = "SLONG"
            java.lang.String r28 = "SRATIONAL"
            java.lang.String r29 = "SINGLE"
            java.lang.String[] r10 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31}
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES = r10
            r10 = 14
            int[] r13 = new int[r10]
            r13 = {x0f30: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT = r13
            byte[] r13 = new byte[r6]
            r13 = {x0f50: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX = r13
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r18 = 14
            java.lang.String r10 = "NewSubfileType"
            r19 = 8
            r6 = 254(0xfe, float:3.56E-43)
            r13.<init>(r10, r6, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "SubfileType"
            r2 = 255(0xff, float:3.57E-43)
            r6.<init>(r10, r2, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ImageWidth"
            r11 = 256(0x100, float:3.59E-43)
            r2.<init>(r10, r11, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ImageLength"
            r4 = 257(0x101, float:3.6E-43)
            r10.<init>(r11, r4, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r4 = "BitsPerSample"
            r14 = 258(0x102, float:3.62E-43)
            r11.<init>(r4, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Compression"
            r8 = 259(0x103, float:3.63E-43)
            r4.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PhotometricInterpretation"
            r5 = 262(0x106, float:3.67E-43)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ImageDescription"
            r0 = 270(0x10e, float:3.78E-43)
            r30 = r2
            r2 = 2
            r5.<init>(r14, r0, r2)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Make"
            r31 = r4
            r4 = 271(0x10f, float:3.8E-43)
            r0.<init>(r14, r4, r2)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Model"
            r32 = r0
            r0 = 272(0x110, float:3.81E-43)
            r4.<init>(r14, r0, r2)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "StripOffsets"
            r14 = 273(0x111, float:3.83E-43)
            r33 = r4
            r34 = r5
            r4 = 3
            r5 = 4
            r0.<init>(r2, r14, r4, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Orientation"
            r35 = r0
            r0 = 274(0x112, float:3.84E-43)
            r5.<init>(r14, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SamplesPerPixel"
            r36 = r5
            r5 = 277(0x115, float:3.88E-43)
            r0.<init>(r14, r5, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "RowsPerStrip"
            r37 = r0
            r0 = 278(0x116, float:3.9E-43)
            r38 = r6
            r6 = 4
            r5.<init>(r14, r0, r4, r6)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "StripByteCounts"
            r39 = r5
            r5 = 279(0x117, float:3.91E-43)
            r0.<init>(r14, r5, r4, r6)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "XResolution"
            r6 = 282(0x11a, float:3.95E-43)
            r14 = 5
            r4.<init>(r5, r6, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YResolution"
            r40 = r0
            r0 = 283(0x11b, float:3.97E-43)
            r5.<init>(r6, r0, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PlanarConfiguration"
            r14 = 284(0x11c, float:3.98E-43)
            r41 = r4
            r4 = 3
            r0.<init>(r6, r14, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ResolutionUnit"
            r42 = r0
            r0 = 296(0x128, float:4.15E-43)
            r6.<init>(r14, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "TransferFunction"
            r43 = r5
            r5 = 301(0x12d, float:4.22E-43)
            r0.<init>(r14, r5, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "Software"
            r14 = 305(0x131, float:4.27E-43)
            r44 = r0
            r0 = 2
            r4.<init>(r5, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DateTime"
            r45 = r4
            r4 = 306(0x132, float:4.29E-43)
            r5.<init>(r14, r4, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Artist"
            r46 = r5
            r5 = 315(0x13b, float:4.41E-43)
            r4.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "WhitePoint"
            r14 = 318(0x13e, float:4.46E-43)
            r47 = r4
            r4 = 5
            r0.<init>(r5, r14, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PrimaryChromaticities"
            r48 = r0
            r0 = 319(0x13f, float:4.47E-43)
            r5.<init>(r14, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r4 = "SubIFDPointer"
            r14 = 330(0x14a, float:4.62E-43)
            r49 = r5
            r5 = 4
            r0.<init>(r4, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r14 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r50 = r0
            r0 = 513(0x201, float:7.19E-43)
            r51 = r6
            java.lang.String r6 = "JPEGInterchangeFormat"
            r14.<init>(r6, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r52 = r8
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r53 = r10
            r10 = 514(0x202, float:7.2E-43)
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "YCbCrCoefficients"
            r10 = 529(0x211, float:7.41E-43)
            r54 = r0
            r0 = 5
            r5.<init>(r8, r10, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "YCbCrSubSampling"
            r10 = 530(0x212, float:7.43E-43)
            r55 = r5
            r5 = 3
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YCbCrPositioning"
            r56 = r0
            r0 = 531(0x213, float:7.44E-43)
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ReferenceBlackWhite"
            r10 = 532(0x214, float:7.45E-43)
            r57 = r8
            r8 = 5
            r0.<init>(r5, r10, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "Copyright"
            r10 = 33432(0x8298, float:4.6848E-41)
            r58 = r0
            r0 = 2
            r5.<init>(r8, r10, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ExifIFDPointer"
            r10 = 34665(0x8769, float:4.8576E-41)
            r59 = r5
            r5 = 4
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "GPSInfoIFDPointer"
            r60 = r0
            r0 = 34853(0x8825, float:4.884E-41)
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "SensorTopBorder"
            r0.<init>(r10, r5, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r61 = r0
            java.lang.String r0 = "SensorLeftBorder"
            r62 = r8
            r8 = 5
            r10.<init>(r0, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "SensorBottomBorder"
            r63 = r10
            r10 = 6
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "SensorRightBorder"
            r64 = r0
            r0 = 7
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ISO"
            r0 = 23
            r65 = r8
            r8 = 3
            r5.<init>(r10, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "JpgFromRaw"
            r66 = 23
            r0 = 46
            r67 = r5
            r5 = 7
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "Xmp"
            r10 = 700(0x2bc, float:9.81E-43)
            r68 = r8
            r8 = 1
            r0.<init>(r5, r10, r8)
            r5 = 42
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = new androidx.exifinterface.media.ExifInterface.ExifTag[r5]
            r5[r16] = r13
            r5[r8] = r38
            r28 = 2
            r5[r28] = r30
            r29 = 3
            r5[r29] = r53
            r27 = 4
            r5[r27] = r11
            r25 = 5
            r5[r25] = r31
            r23 = 6
            r5[r23] = r52
            r21 = 7
            r5[r21] = r34
            r5[r19] = r32
            r8 = 9
            r5[r8] = r33
            r5[r17] = r35
            r10 = 11
            r5[r10] = r36
            r11 = 12
            r5[r11] = r37
            r13 = 13
            r5[r13] = r39
            r5[r18] = r40
            r30 = 13
            r13 = 15
            r5[r13] = r41
            r31 = 15
            r13 = 16
            r5[r13] = r43
            r32 = 16
            r13 = 17
            r5[r13] = r42
            r33 = 17
            r13 = 18
            r5[r13] = r51
            r34 = 19
            r5[r34] = r44
            r34 = 20
            r5[r34] = r45
            r34 = 21
            r5[r34] = r46
            r34 = 22
            r5[r34] = r47
            r5[r66] = r48
            r34 = 24
            r5[r34] = r49
            r34 = 25
            r5[r34] = r50
            r34 = 18
            r13 = 26
            r5[r13] = r14
            r14 = 27
            r5[r14] = r54
            r14 = 28
            r5[r14] = r55
            r14 = 29
            r5[r14] = r56
            r14 = 30
            r5[r14] = r57
            r14 = 31
            r5[r14] = r58
            r14 = 32
            r5[r14] = r59
            r14 = 33
            r5[r14] = r60
            r14 = 34
            r5[r14] = r62
            r14 = 35
            r5[r14] = r61
            r14 = 36
            r5[r14] = r63
            r14 = 37
            r5[r14] = r64
            r14 = 38
            r5[r14] = r65
            r14 = 39
            r5[r14] = r67
            r14 = 40
            r5[r14] = r68
            r14 = 41
            r5[r14] = r0
            androidx.exifinterface.media.ExifInterface.IFD_TIFF_TAGS = r5
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ExposureTime"
            r35 = 26
            r13 = 33434(0x829a, float:4.6851E-41)
            r11 = 5
            r36 = 12
            r0.<init>(r14, r13, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "FNumber"
            r37 = 11
            r10 = 33437(0x829d, float:4.6855E-41)
            r13.<init>(r14, r10, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ExposureProgram"
            r14 = 34850(0x8822, float:4.8835E-41)
            r8 = 3
            r38 = 9
            r10.<init>(r11, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SpectralSensitivity"
            r8 = 34852(0x8824, float:4.8838E-41)
            r39 = r0
            r0 = 2
            r11.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "PhotographicSensitivity"
            r14 = 34855(0x8827, float:4.8842E-41)
            r40 = r5
            r5 = 3
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "OECF"
            r5 = 34856(0x8828, float:4.8844E-41)
            r41 = r0
            r0 = 7
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "SensitivityType"
            r14 = 34864(0x8830, float:4.8855E-41)
            r42 = r8
            r8 = 3
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "StandardOutputSensitivity"
            r14 = 34865(0x8831, float:4.8856E-41)
            r43 = r0
            r0 = 4
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "RecommendedExposureIndex"
            r44 = r5
            r5 = 34866(0x8832, float:4.8858E-41)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ISOSpeed"
            r45 = r8
            r8 = 34867(0x8833, float:4.8859E-41)
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ISOSpeedLatitudeyyy"
            r46 = r5
            r5 = 34868(0x8834, float:4.886E-41)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ISOSpeedLatitudezzz"
            r47 = r8
            r8 = 34869(0x8835, float:4.8862E-41)
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ExifVersion"
            r14 = 36864(0x9000, float:5.1657E-41)
            r48 = r5
            r5 = 2
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DateTimeOriginal"
            r49 = r0
            r0 = 36867(0x9003, float:5.1662E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DateTimeDigitized"
            r50 = r8
            r8 = 36868(0x9004, float:5.1663E-41)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "OffsetTime"
            r51 = r0
            r0 = 36880(0x9010, float:5.168E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "OffsetTimeOriginal"
            r52 = r8
            r8 = 36881(0x9011, float:5.1681E-41)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "OffsetTimeDigitized"
            r53 = r0
            r0 = 36882(0x9012, float:5.1683E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ComponentsConfiguration"
            r14 = 37121(0x9101, float:5.2018E-41)
            r54 = r8
            r8 = 7
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "CompressedBitsPerPixel"
            r14 = 37122(0x9102, float:5.2019E-41)
            r55 = r0
            r0 = 5
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ShutterSpeedValue"
            r0 = 37377(0x9201, float:5.2376E-41)
            r56 = r5
            r5 = 10
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ApertureValue"
            r5 = 37378(0x9202, float:5.2378E-41)
            r57 = r8
            r8 = 5
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "BrightnessValue"
            r14 = 37379(0x9203, float:5.2379E-41)
            r58 = r0
            r0 = 10
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ExposureBiasValue"
            r59 = r5
            r5 = 37380(0x9204, float:5.238E-41)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "MaxApertureValue"
            r14 = 37381(0x9205, float:5.2382E-41)
            r60 = r8
            r8 = 5
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SubjectDistance"
            r61 = r0
            r0 = 37382(0x9206, float:5.2383E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "MeteringMode"
            r14 = 37383(0x9207, float:5.2385E-41)
            r62 = r5
            r5 = 3
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "LightSource"
            r63 = r0
            r0 = 37384(0x9208, float:5.2386E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Flash"
            r64 = r8
            r8 = 37385(0x9209, float:5.2388E-41)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "FocalLength"
            r5 = 37386(0x920a, float:5.2389E-41)
            r65 = r0
            r0 = 5
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "SubjectArea"
            r14 = 37396(0x9214, float:5.2403E-41)
            r67 = r8
            r8 = 3
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "MakerNote"
            r14 = 37500(0x927c, float:5.2549E-41)
            r68 = r0
            r0 = 7
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "UserComment"
            r69 = r5
            r5 = 37510(0x9286, float:5.2563E-41)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "SubSecTime"
            r14 = 37520(0x9290, float:5.2577E-41)
            r70 = r8
            r8 = 2
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SubSecTimeOriginal"
            r71 = r0
            r0 = 37521(0x9291, float:5.2578E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SubSecTimeDigitized"
            r72 = r5
            r5 = 37522(0x9292, float:5.258E-41)
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "FlashpixVersion"
            r14 = 40960(0xa000, float:5.7397E-41)
            r73 = r0
            r0 = 7
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ColorSpace"
            r14 = 40961(0xa001, float:5.7399E-41)
            r74 = r5
            r5 = 3
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PixelXDimension"
            r75 = r0
            r0 = 40962(0xa002, float:5.74E-41)
            r76 = r10
            r10 = 4
            r8.<init>(r14, r0, r5, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PixelYDimension"
            r77 = r8
            r8 = 40963(0xa003, float:5.7401E-41)
            r0.<init>(r14, r8, r5, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "RelatedSoundFile"
            r14 = 40964(0xa004, float:5.7403E-41)
            r10 = 2
            r5.<init>(r8, r14, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "InteroperabilityIFDPointer"
            r14 = 40965(0xa005, float:5.7404E-41)
            r78 = r0
            r0 = 4
            r8.<init>(r10, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "FlashEnergy"
            r14 = 41483(0xa20b, float:5.813E-41)
            r79 = r5
            r5 = 5
            r0.<init>(r10, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SpatialFrequencyResponse"
            r5 = 41484(0xa20c, float:5.8131E-41)
            r80 = r0
            r0 = 7
            r10.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "FocalPlaneXResolution"
            r14 = 41486(0xa20e, float:5.8134E-41)
            r81 = r8
            r8 = 5
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "FocalPlaneYResolution"
            r82 = r0
            r0 = 41487(0xa20f, float:5.8136E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "FocalPlaneResolutionUnit"
            r14 = 41488(0xa210, float:5.8137E-41)
            r83 = r5
            r5 = 3
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SubjectLocation"
            r84 = r0
            r0 = 41492(0xa214, float:5.8143E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ExposureIndex"
            r5 = 41493(0xa215, float:5.8144E-41)
            r85 = r8
            r8 = 5
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "SensingMethod"
            r14 = 41495(0xa217, float:5.8147E-41)
            r86 = r0
            r0 = 3
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "FileSource"
            r14 = 41728(0xa300, float:5.8473E-41)
            r87 = r5
            r5 = 7
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SceneType"
            r88 = r0
            r0 = 41729(0xa301, float:5.8475E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "CFAPattern"
            r89 = r8
            r8 = 41730(0xa302, float:5.8476E-41)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "CustomRendered"
            r14 = 41985(0xa401, float:5.8834E-41)
            r90 = r0
            r0 = 3
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ExposureMode"
            r91 = r5
            r5 = 41986(0xa402, float:5.8835E-41)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "WhiteBalance"
            r92 = r8
            r8 = 41987(0xa403, float:5.8836E-41)
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DigitalZoomRatio"
            r0 = 41988(0xa404, float:5.8838E-41)
            r93 = r5
            r5 = 5
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "FocalLengthIn35mmFilm"
            r14 = 41989(0xa405, float:5.8839E-41)
            r94 = r8
            r8 = 3
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SceneCaptureType"
            r95 = r0
            r0 = 41990(0xa406, float:5.884E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GainControl"
            r96 = r5
            r5 = 41991(0xa407, float:5.8842E-41)
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Contrast"
            r97 = r0
            r0 = 41992(0xa408, float:5.8843E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Saturation"
            r98 = r5
            r5 = 41993(0xa409, float:5.8845E-41)
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Sharpness"
            r99 = r0
            r0 = 41994(0xa40a, float:5.8846E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DeviceSettingDescription"
            r8 = 41995(0xa40b, float:5.8848E-41)
            r100 = r5
            r5 = 7
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "SubjectDistanceRange"
            r14 = 41996(0xa40c, float:5.8849E-41)
            r101 = r0
            r0 = 3
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ImageUniqueID"
            r14 = 42016(0xa420, float:5.8877E-41)
            r102 = r5
            r5 = 2
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "CameraOwnerName"
            r103 = r0
            r0 = 42032(0xa430, float:5.89E-41)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "BodySerialNumber"
            r104 = r8
            r8 = 42033(0xa431, float:5.8901E-41)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "LensSpecification"
            r5 = 42034(0xa432, float:5.8902E-41)
            r105 = r0
            r0 = 5
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "LensMake"
            r14 = 42035(0xa433, float:5.8904E-41)
            r106 = r8
            r8 = 2
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "LensModel"
            r107 = r0
            r0 = 42036(0xa434, float:5.8905E-41)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "Gamma"
            r14 = 42240(0xa500, float:5.9191E-41)
            r108 = r5
            r5 = 5
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "DNGVersion"
            r14 = 50706(0xc612, float:7.1054E-41)
            r109 = r0
            r0 = 1
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DefaultCropSize"
            r20 = 1
            r0 = 50720(0xc620, float:7.1074E-41)
            r110 = r5
            r111 = r10
            r5 = 3
            r10 = 4
            r8.<init>(r14, r0, r5, r10)
            r0 = 74
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r0]
            r0[r16] = r39
            r0[r20] = r13
            r28 = 2
            r0[r28] = r76
            r0[r5] = r11
            r0[r10] = r41
            r25 = 5
            r0[r25] = r42
            r23 = 6
            r0[r23] = r43
            r21 = 7
            r0[r21] = r44
            r0[r19] = r45
            r0[r38] = r46
            r17 = 10
            r0[r17] = r47
            r0[r37] = r48
            r0[r36] = r49
            r0[r30] = r50
            r0[r18] = r51
            r0[r31] = r52
            r0[r32] = r53
            r0[r33] = r54
            r0[r34] = r55
            r5 = 19
            r0[r5] = r56
            r5 = 20
            r0[r5] = r57
            r5 = 21
            r0[r5] = r58
            r5 = 22
            r0[r5] = r59
            r0[r66] = r60
            r5 = 24
            r0[r5] = r61
            r5 = 25
            r0[r5] = r62
            r0[r35] = r63
            r5 = 27
            r0[r5] = r64
            r5 = 28
            r0[r5] = r65
            r5 = 29
            r0[r5] = r67
            r5 = 30
            r0[r5] = r68
            r5 = 31
            r0[r5] = r69
            r5 = 32
            r0[r5] = r70
            r5 = 33
            r0[r5] = r71
            r5 = 34
            r0[r5] = r72
            r5 = 35
            r0[r5] = r73
            r5 = 36
            r0[r5] = r74
            r5 = 37
            r0[r5] = r75
            r5 = 38
            r0[r5] = r77
            r5 = 39
            r0[r5] = r78
            r5 = 40
            r0[r5] = r79
            r5 = 41
            r0[r5] = r81
            r5 = 42
            r0[r5] = r80
            r5 = 43
            r0[r5] = r111
            r5 = 44
            r0[r5] = r82
            r5 = 45
            r0[r5] = r83
            r5 = 46
            r0[r5] = r84
            r5 = 47
            r0[r5] = r85
            r5 = 48
            r0[r5] = r86
            r5 = 49
            r0[r5] = r87
            r5 = 50
            r0[r5] = r88
            r5 = 51
            r0[r5] = r89
            r5 = 52
            r0[r5] = r90
            r5 = 53
            r0[r5] = r91
            r5 = 54
            r0[r5] = r92
            r5 = 55
            r0[r5] = r93
            r5 = 56
            r0[r5] = r94
            r5 = 57
            r0[r5] = r95
            r5 = 58
            r0[r5] = r96
            r5 = 59
            r0[r5] = r97
            r5 = 60
            r0[r5] = r98
            r5 = 61
            r0[r5] = r99
            r5 = 62
            r0[r5] = r100
            r5 = 63
            r0[r5] = r101
            r5 = 64
            r0[r5] = r102
            r5 = 65
            r0[r5] = r103
            r5 = 66
            r0[r5] = r104
            r5 = 67
            r0[r5] = r105
            r5 = 68
            r0[r5] = r106
            r5 = 69
            r0[r5] = r107
            r5 = 70
            r0[r5] = r108
            r5 = 71
            r0[r5] = r109
            r5 = 72
            r0[r5] = r110
            r5 = 73
            r0[r5] = r8
            androidx.exifinterface.media.ExifInterface.IFD_EXIF_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSVersionID"
            r10 = 1
            r11 = 0
            r5.<init>(r8, r11, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSLatitudeRef"
            r13 = 2
            r8.<init>(r11, r10, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSLatitude"
            r39 = r0
            r14 = 5
            r0 = 10
            r10.<init>(r11, r13, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r0 = "GPSLongitudeRef"
            r14 = 3
            r11.<init>(r0, r14, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "GPSLongitude"
            r41 = r5
            r42 = r8
            r5 = 5
            r8 = 10
            r14 = 4
            r0.<init>(r13, r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "GPSAltitudeRef"
            r14 = 1
            r8.<init>(r13, r5, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSAltitude"
            r43 = r0
            r0 = 6
            r13.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSTimeStamp"
            r44 = r8
            r8 = 7
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSSatellites"
            r45 = r0
            r0 = 2
            r14 = 8
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSStatus"
            r46 = r5
            r5 = 9
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSMeasureMode"
            r47 = r8
            r8 = 10
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDOP"
            r48 = r5
            r0 = 5
            r5 = 11
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSSpeedRef"
            r49 = r8
            r0 = 2
            r8 = 12
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSSpeed"
            r50 = r5
            r0 = 5
            r5 = 13
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSTrackRef"
            r51 = r8
            r0 = 2
            r8 = 14
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSTrack"
            r52 = r5
            r0 = 5
            r5 = 15
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSImgDirectionRef"
            r53 = r8
            r0 = 2
            r8 = 16
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSImgDirection"
            r54 = r5
            r0 = 5
            r5 = 17
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSMapDatum"
            r55 = r8
            r0 = 2
            r8 = 18
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestLatitudeRef"
            r56 = r5
            r5 = 19
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestLatitude"
            r0 = 20
            r57 = r8
            r8 = 5
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestLongitudeRef"
            r8 = 21
            r58 = r5
            r5 = 2
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestLongitude"
            r5 = 22
            r59 = r0
            r0 = 5
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestBearingRef"
            r60 = r8
            r0 = 2
            r8 = 23
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestBearing"
            r0 = 24
            r61 = r5
            r5 = 5
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSDestDistanceRef"
            r5 = 25
            r62 = r8
            r8 = 2
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSDestDistance"
            r63 = r0
            r0 = 26
            r14 = 5
            r5.<init>(r8, r0, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSProcessingMethod"
            r14 = 27
            r64 = r5
            r5 = 7
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSAreaInformation"
            r65 = r0
            r0 = 28
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "GPSDateStamp"
            r14 = 29
            r67 = r8
            r8 = 2
            r0.<init>(r5, r14, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSDifferential"
            r14 = 30
            r68 = r0
            r0 = 3
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "GPSHPositioningError"
            r29 = 3
            r0 = 31
            r69 = r5
            r5 = 5
            r8.<init>(r14, r0, r5)
            r0 = 32
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r0]
            r16 = 0
            r0[r16] = r41
            r20 = 1
            r0[r20] = r42
            r28 = 2
            r0[r28] = r10
            r0[r29] = r11
            r27 = 4
            r0[r27] = r43
            r0[r5] = r44
            r23 = 6
            r0[r23] = r13
            r21 = 7
            r0[r21] = r45
            r19 = 8
            r0[r19] = r46
            r38 = 9
            r0[r38] = r47
            r17 = 10
            r0[r17] = r48
            r37 = 11
            r0[r37] = r49
            r36 = 12
            r0[r36] = r50
            r30 = 13
            r0[r30] = r51
            r18 = 14
            r0[r18] = r52
            r31 = 15
            r0[r31] = r53
            r32 = 16
            r0[r32] = r54
            r33 = 17
            r0[r33] = r55
            r34 = 18
            r0[r34] = r56
            r5 = 19
            r0[r5] = r57
            r5 = 20
            r0[r5] = r58
            r5 = 21
            r0[r5] = r59
            r5 = 22
            r0[r5] = r60
            r66 = 23
            r0[r66] = r61
            r5 = 24
            r0[r5] = r62
            r5 = 25
            r0[r5] = r63
            r35 = 26
            r0[r35] = r64
            r5 = 27
            r0[r5] = r65
            r5 = 28
            r0[r5] = r67
            r5 = 29
            r0[r5] = r68
            r5 = 30
            r0[r5] = r69
            r5 = 31
            r0[r5] = r8
            androidx.exifinterface.media.ExifInterface.IFD_GPS_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "InteroperabilityIndex"
            r10 = 1
            r13 = 2
            r5.<init>(r8, r10, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r8 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10]
            r16 = 0
            r8[r16] = r5
            androidx.exifinterface.media.ExifInterface.IFD_INTEROPERABILITY_TAGS = r8
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "NewSubfileType"
            r11 = 254(0xfe, float:3.56E-43)
            r14 = 4
            r5.<init>(r10, r11, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "SubfileType"
            r13 = 255(0xff, float:3.57E-43)
            r10.<init>(r11, r13, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ThumbnailImageWidth"
            r41 = r0
            r42 = r5
            r0 = 3
            r5 = 256(0x100, float:3.59E-43)
            r11.<init>(r13, r5, r0, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ThumbnailImageLength"
            r43 = r8
            r8 = 257(0x101, float:3.6E-43)
            r5.<init>(r13, r8, r0, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "BitsPerSample"
            r14 = 258(0x102, float:3.62E-43)
            r8.<init>(r13, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Compression"
            r44 = r5
            r5 = 259(0x103, float:3.63E-43)
            r13.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PhotometricInterpretation"
            r45 = r8
            r8 = 262(0x106, float:3.67E-43)
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ImageDescription"
            r14 = 270(0x10e, float:3.78E-43)
            r46 = r5
            r5 = 2
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Make"
            r47 = r0
            r0 = 271(0x10f, float:3.8E-43)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Model"
            r48 = r8
            r8 = 272(0x110, float:3.81E-43)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r49 = r0
            r0 = 273(0x111, float:3.83E-43)
            r8 = 3
            r14 = 4
            r5.<init>(r2, r0, r8, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ThumbnailOrientation"
            r50 = r5
            r5 = 274(0x112, float:3.84E-43)
            r0.<init>(r14, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "SamplesPerPixel"
            r51 = r0
            r0 = 277(0x115, float:3.88E-43)
            r5.<init>(r14, r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "RowsPerStrip"
            r52 = r5
            r5 = 278(0x116, float:3.9E-43)
            r53 = r10
            r10 = 4
            r0.<init>(r14, r5, r8, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "StripByteCounts"
            r54 = r0
            r0 = 279(0x117, float:3.91E-43)
            r5.<init>(r14, r0, r8, r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "XResolution"
            r10 = 282(0x11a, float:3.95E-43)
            r14 = 5
            r0.<init>(r8, r10, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YResolution"
            r55 = r0
            r0 = 283(0x11b, float:3.97E-43)
            r8.<init>(r10, r0, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PlanarConfiguration"
            r14 = 284(0x11c, float:3.98E-43)
            r56 = r5
            r5 = 3
            r0.<init>(r10, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "ResolutionUnit"
            r57 = r0
            r0 = 296(0x128, float:4.15E-43)
            r10.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "TransferFunction"
            r58 = r8
            r8 = 301(0x12d, float:4.22E-43)
            r0.<init>(r14, r8, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "Software"
            r14 = 305(0x131, float:4.27E-43)
            r59 = r0
            r0 = 2
            r5.<init>(r8, r14, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "DateTime"
            r60 = r5
            r5 = 306(0x132, float:4.29E-43)
            r8.<init>(r14, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "Artist"
            r61 = r8
            r8 = 315(0x13b, float:4.41E-43)
            r5.<init>(r14, r8, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "WhitePoint"
            r14 = 318(0x13e, float:4.46E-43)
            r62 = r5
            r5 = 5
            r0.<init>(r8, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "PrimaryChromaticities"
            r63 = r0
            r0 = 319(0x13f, float:4.47E-43)
            r8.<init>(r14, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r5 = 4
            r14 = 330(0x14a, float:4.62E-43)
            r0.<init>(r4, r14, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r14 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r64 = r0
            r0 = 513(0x201, float:7.19E-43)
            r14.<init>(r6, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r65 = r8
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r67 = r10
            r10 = 514(0x202, float:7.2E-43)
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "YCbCrCoefficients"
            r10 = 529(0x211, float:7.41E-43)
            r68 = r0
            r0 = 5
            r5.<init>(r8, r10, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "YCbCrSubSampling"
            r10 = 530(0x212, float:7.43E-43)
            r69 = r5
            r5 = 3
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YCbCrPositioning"
            r70 = r0
            r0 = 531(0x213, float:7.44E-43)
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ReferenceBlackWhite"
            r10 = 532(0x214, float:7.45E-43)
            r71 = r8
            r8 = 5
            r0.<init>(r5, r10, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "Copyright"
            r10 = 33432(0x8298, float:4.6848E-41)
            r72 = r0
            r0 = 2
            r5.<init>(r8, r10, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ExifIFDPointer"
            r10 = 34665(0x8769, float:4.8576E-41)
            r73 = r5
            r5 = 4
            r0.<init>(r8, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "GPSInfoIFDPointer"
            r74 = r0
            r0 = 34853(0x8825, float:4.884E-41)
            r8.<init>(r10, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "DNGVersion"
            r5 = 50706(0xc612, float:7.1054E-41)
            r75 = r8
            r8 = 1
            r0.<init>(r10, r5, r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "DefaultCropSize"
            r20 = 1
            r8 = 50720(0xc620, float:7.1074E-41)
            r76 = r0
            r27 = r11
            r0 = 3
            r11 = 4
            r5.<init>(r10, r8, r0, r11)
            r8 = 37
            androidx.exifinterface.media.ExifInterface$ExifTag[] r8 = new androidx.exifinterface.media.ExifInterface.ExifTag[r8]
            r16 = 0
            r8[r16] = r42
            r8[r20] = r53
            r28 = 2
            r8[r28] = r27
            r8[r0] = r44
            r8[r11] = r45
            r25 = 5
            r8[r25] = r13
            r23 = 6
            r8[r23] = r46
            r21 = 7
            r8[r21] = r47
            r19 = 8
            r8[r19] = r48
            r38 = 9
            r8[r38] = r49
            r17 = 10
            r8[r17] = r50
            r37 = 11
            r8[r37] = r51
            r36 = 12
            r8[r36] = r52
            r30 = 13
            r8[r30] = r54
            r18 = 14
            r8[r18] = r56
            r31 = 15
            r8[r31] = r55
            r32 = 16
            r8[r32] = r58
            r33 = 17
            r8[r33] = r57
            r34 = 18
            r8[r34] = r67
            r0 = 19
            r8[r0] = r59
            r0 = 20
            r8[r0] = r60
            r0 = 21
            r8[r0] = r61
            r0 = 22
            r8[r0] = r62
            r66 = 23
            r8[r66] = r63
            r0 = 24
            r8[r0] = r65
            r0 = 25
            r8[r0] = r64
            r35 = 26
            r8[r35] = r14
            r0 = 27
            r8[r0] = r68
            r0 = 28
            r8[r0] = r69
            r0 = 29
            r8[r0] = r70
            r0 = 30
            r8[r0] = r71
            r0 = 31
            r8[r0] = r72
            r0 = 32
            r8[r0] = r73
            r0 = 33
            r8[r0] = r74
            r0 = 34
            r8[r0] = r75
            r0 = 35
            r8[r0] = r76
            r0 = 36
            r8[r0] = r5
            androidx.exifinterface.media.ExifInterface.IFD_THUMBNAIL_TAGS = r8
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r5 = 3
            r10 = 273(0x111, float:3.83E-43)
            r0.<init>(r2, r10, r5)
            androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ThumbnailImage"
            r5 = 7
            r10 = 256(0x100, float:3.59E-43)
            r0.<init>(r2, r10, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "CameraSettingsIFDPointer"
            r10 = 8224(0x2020, float:1.1524E-41)
            r14 = 4
            r2.<init>(r5, r10, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ImageProcessingIFDPointer"
            r11 = 8256(0x2040, float:1.1569E-41)
            r5.<init>(r10, r11, r14)
            r10 = 3
            androidx.exifinterface.media.ExifInterface$ExifTag[] r11 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10]
            r16 = 0
            r11[r16] = r0
            r10 = 1
            r11[r10] = r2
            r0 = 2
            r11[r0] = r5
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_TAGS = r11
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "PreviewImageStart"
            r13 = 257(0x101, float:3.6E-43)
            r2.<init>(r5, r13, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "PreviewImageLength"
            r10 = 258(0x102, float:3.62E-43)
            r20 = 1
            r5.<init>(r13, r10, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r10 = new androidx.exifinterface.media.ExifInterface.ExifTag[r0]
            r10[r16] = r2
            r10[r20] = r5
            androidx.exifinterface.media.ExifInterface.ORF_CAMERA_SETTINGS_TAGS = r10
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "AspectFrame"
            r5 = 4371(0x1113, float:6.125E-42)
            r14 = 3
            r0.<init>(r2, r5, r14)
            r2 = 1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = new androidx.exifinterface.media.ExifInterface.ExifTag[r2]
            r5[r16] = r0
            androidx.exifinterface.media.ExifInterface.ORF_IMAGE_PROCESSING_TAGS = r5
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ColorSpace"
            r18 = r5
            r5 = 55
            r0.<init>(r13, r5, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = new androidx.exifinterface.media.ExifInterface.ExifTag[r2]
            r5[r16] = r0
            androidx.exifinterface.media.ExifInterface.PEF_TAGS = r5
            r0 = 10
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r0][]
            r0[r16] = r40
            r0[r2] = r39
            r28 = 2
            r0[r28] = r41
            r0[r14] = r43
            r14 = 4
            r0[r14] = r8
            r25 = 5
            r0[r25] = r40
            r23 = 6
            r0[r23] = r11
            r21 = 7
            r0[r21] = r10
            r19 = 8
            r0[r19] = r18
            r38 = 9
            r0[r38] = r5
            androidx.exifinterface.media.ExifInterface.EXIF_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r5 = 330(0x14a, float:4.62E-43)
            r2.<init>(r4, r5, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ExifIFDPointer"
            r8 = 34665(0x8769, float:4.8576E-41)
            r4.<init>(r5, r8, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "GPSInfoIFDPointer"
            r10 = 34853(0x8825, float:4.884E-41)
            r5.<init>(r8, r10, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "InteroperabilityIFDPointer"
            r11 = 40965(0xa005, float:5.7404E-41)
            r8.<init>(r10, r11, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "CameraSettingsIFDPointer"
            r13 = 8224(0x2020, float:1.1524E-41)
            r14 = 1
            r10.<init>(r11, r13, r14)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ImageProcessingIFDPointer"
            r17 = r2
            r2 = 8256(0x2040, float:1.1569E-41)
            r11.<init>(r13, r2, r14)
            r2 = 6
            androidx.exifinterface.media.ExifInterface$ExifTag[] r2 = new androidx.exifinterface.media.ExifInterface.ExifTag[r2]
            r16 = 0
            r2[r16] = r17
            r2[r14] = r4
            r28 = 2
            r2[r28] = r5
            r29 = 3
            r2[r29] = r8
            r5 = 4
            r2[r5] = r10
            r25 = 5
            r2[r25] = r11
            androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r4 = 513(0x201, float:7.19E-43)
            r2.<init>(r6, r4, r5)
            androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG = r2
            androidx.exifinterface.media.ExifInterface$ExifTag r2 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r6 = 514(0x202, float:7.2E-43)
            r2.<init>(r4, r6, r5)
            androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = r2
            int r2 = r0.length
            java.util.HashMap[] r2 = new java.util.HashMap[r2]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading = r2
            int r0 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r2 = "SubjectDistance"
            java.lang.String r4 = "GPSTimeStamp"
            java.lang.String r5 = "FNumber"
            java.lang.String r6 = "DigitalZoomRatio"
            java.lang.String r8 = "ExposureTime"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r8, r2, r4}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.exifinterface.media.ExifInterface.sExifPointerTagMap = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.exifinterface.media.ExifInterface.ASCII = r0
            java.lang.String r2 = "Exif\u0000\u0000"
            byte[] r2 = r2.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1 = r2
            java.lang.String r2 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r0 = r2.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r4 = "yyyy:MM:dd HH:mm:ss"
            r0.<init>(r4, r2)
            androidx.exifinterface.media.ExifInterface.sFormatterPrimary = r0
            java.lang.String r4 = "UTC"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)
            r0.setTimeZone(r4)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r4, r2)
            androidx.exifinterface.media.ExifInterface.sFormatterSecondary = r0
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            r0.setTimeZone(r2)
            r11 = 0
        Le26:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r2 = r0.length
            if (r11 >= r2) goto Le61
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r2 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2[r11] = r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r2 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2[r11] = r4
            r0 = r0[r11]
            int r2 = r0.length
            r4 = 0
        Le41:
            if (r4 >= r2) goto Le5e
            r5 = r0[r4]
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r6 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r6 = r6[r11]
            int r8 = r5.number
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.put(r8, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r6 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r6 = r6[r11]
            java.lang.String r8 = r5.name
            r6.put(r8, r5)
            int r4 = r4 + 1
            goto Le41
        Le5e:
            int r11 = r11 + 1
            goto Le26
        Le61:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            androidx.exifinterface.media.ExifInterface$ExifTag[] r2 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r16 = 0
            r4 = r2[r16]
            int r4 = r4.number
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r15)
            r20 = 1
            r4 = r2[r20]
            int r4 = r4.number
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r3)
            r28 = 2
            r3 = r2[r28]
            int r3 = r3.number
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r9)
            r29 = 3
            r3 = r2[r29]
            int r3 = r3.number
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r1)
            r27 = 4
            r1 = r2[r27]
            int r1 = r1.number
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r12)
            r25 = 5
            r1 = r2[r25]
            int r1 = r1.number
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r7)
            java.lang.String r0 = ".*[1-9].*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN = r0
            java.lang.String r0 = "^(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.GPS_TIMESTAMP_PATTERN = r0
            java.lang.String r0 = "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_PRIMARY_FORMAT_PATTERN = r0
            java.lang.String r0 = "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_SECONDARY_FORMAT_PATTERN = r0
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.File r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            if (r3 == 0) goto L20
            java.lang.String r3 = r3.getAbsolutePath()
            r2.initForFilename(r3)
            return
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "file cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.FileDescriptor r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.mExifByteOrder = r0
            if (r5 == 0) goto L57
            r0 = 0
            r4.mAssetInputStream = r0
            r4.mFilename = r0
            boolean r1 = isSeekableFD(r5)
            if (r1 == 0) goto L34
            r4.mSeekableFileDescriptor = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch: java.lang.Exception -> L2b
            r1 = 1
            goto L37
        L2b:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L34:
            r4.mSeekableFileDescriptor = r0
            r1 = 0
        L37:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.loadAttributes(r2)     // Catch: java.lang.Throwable -> L48
            closeQuietly(r2)
            if (r1 == 0) goto L47
            closeFileDescriptor(r5)
        L47:
            return
        L48:
            r0 = move-exception
            goto L4e
        L4a:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L4e:
            closeQuietly(r2)
            if (r1 == 0) goto L56
            closeFileDescriptor(r5)
        L56:
            throw r0
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "fileDescriptor cannot be null"
            r5.<init>(r0)
            throw r5
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExifInterface(@androidx.annotation.NonNull java.io.InputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.mExifByteOrder = r0
            if (r4 == 0) goto L62
            r0 = 0
            r3.mFilename = r0
            r1 = 1
            if (r5 != r1) goto L34
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            r2 = 5000(0x1388, float:7.006E-42)
            r5.<init>(r4, r2)
            boolean r4 = isExifDataOnly(r5)
            if (r4 != 0) goto L2c
            return
        L2c:
            r3.mIsExifDataOnly = r1
            r3.mAssetInputStream = r0
            r3.mSeekableFileDescriptor = r0
            r4 = r5
            goto L5e
        L34:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L40
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.mAssetInputStream = r5
            r3.mSeekableFileDescriptor = r0
            goto L5e
        L40:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L5a
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = isSeekableFD(r1)
            if (r1 == 0) goto L5a
            r3.mAssetInputStream = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.mSeekableFileDescriptor = r5
            goto L5e
        L5a:
            r3.mAssetInputStream = r0
            r3.mSeekableFileDescriptor = r0
        L5e:
            r3.loadAttributes(r4)
            return
        L62:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
    }

    public ExifInterface(@androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            if (r3 == 0) goto L1c
            r2.initForFilename(r3)
            return
        L1c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
    }

    private void addDefaultValuesForCompatibility() {
            r6 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.getAttribute(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = r6.getAttribute(r2)
            if (r3 != 0) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r1]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r0)
            r3.put(r2, r0)
        L1c:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = r6.getAttribute(r0)
            r3 = 0
            if (r2 != 0) goto L33
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L33:
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L48
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L48:
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L5d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L5d:
            java.lang.String r0 = "LightSource"
            java.lang.String r1 = r6.getAttribute(r0)
            if (r1 != 0) goto L73
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r2 = 1
            r1 = r1[r2]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L73:
            return
    }

    private static java.lang.String byteArrayToHexString(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r5.length
            if (r2 >= r3) goto L24
            r3 = r5[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "%02x"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L24:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static void closeFileDescriptor(java.io.FileDescriptor r0) {
            android.system.Os.close(r0)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    private static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Exception -> L5 java.lang.RuntimeException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    private java.lang.String convertDecimalDegree(double r9) {
            r8 = this;
            long r0 = (long) r9
            double r2 = (double) r0
            double r9 = r9 - r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r9 * r2
            long r4 = (long) r4
            double r6 = (double) r4
            double r6 = r6 / r2
            double r9 = r9 - r6
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r9 = r9 * r2
            r2 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r9 = r9 * r2
            long r9 = java.lang.Math.round(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/1,"
            r2.append(r0)
            r2.append(r4)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = "/10000000"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            return r9
    }

    private static double convertRationalLatLonToDouble(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "/"
            java.lang.String r1 = ","
            r2 = -1
            java.lang.String[] r11 = r11.split(r1, r2)     // Catch: java.lang.Throwable -> L93
            r1 = 0
            r3 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L93
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L93
            r6 = 1
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r4 = r4 / r7
            r3 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r7 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.Throwable -> L93
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r9 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r7 = r7 / r9
            r3 = 2
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r11 = r11.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r0 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L93
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L93
            r11 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L93
            double r2 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.Throwable -> L93
            double r0 = r0 / r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r7 = r7 / r2
            double r4 = r4 + r7
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            double r4 = r4 + r0
            java.lang.String r11 = "S"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L91
            java.lang.String r11 = "W"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L79
            goto L91
        L79:
            java.lang.String r11 = "N"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L90
            java.lang.String r11 = "E"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L8a
            goto L90
        L8a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            throw r11     // Catch: java.lang.Throwable -> L93
        L90:
            return r4
        L91:
            double r11 = -r4
            return r11
        L93:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
    }

    private static long[] convertToLongArray(java.lang.Object r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    private static int copy(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L12
            int r2 = r2 + r3
            r6.write(r0, r1, r3)
            goto L6
        L12:
            return r2
    }

    private static void copy(java.io.InputStream r5, java.io.OutputStream r6, int r7) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
        L4:
            if (r7 <= 0) goto L1e
            int r2 = java.lang.Math.min(r7, r0)
            r3 = 0
            int r4 = r5.read(r1, r3, r2)
            if (r4 != r2) goto L16
            int r7 = r7 - r4
            r6.write(r1, r3, r4)
            goto L4
        L16:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Failed to copy the given amount of bytes from the inputstream to the output stream."
            r5.<init>(r6)
            throw r5
        L1e:
            return
    }

    private void copyChunksUpToGivenChunkType(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r5, byte[] r6, byte[] r7) throws java.io.IOException {
            r3 = this;
        L0:
            r0 = 4
            byte[] r1 = new byte[r0]
            int r2 = r4.read(r1)
            if (r2 == r0) goto L45
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Encountered invalid length while copying WebP chunks up tochunk type "
            r5.append(r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = androidx.exifinterface.media.ExifInterface.ASCII
            r0.<init>(r6, r1)
            r5.append(r0)
            if (r7 != 0) goto L24
            java.lang.String r6 = ""
            goto L3a
        L24:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = " or "
            r6.append(r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L3a:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L45:
            r3.copyWebPChunk(r4, r5, r1)
            boolean r0 = java.util.Arrays.equals(r1, r6)
            if (r0 != 0) goto L56
            if (r7 == 0) goto L0
            boolean r0 = java.util.Arrays.equals(r1, r7)
            if (r0 == 0) goto L0
        L56:
            return
    }

    private void copyWebPChunk(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r4, byte[] r5) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            r4.write(r5)
            r4.writeInt(r0)
            int r5 = r0 % 2
            r1 = 1
            if (r5 != r1) goto L11
            int r0 = r0 + 1
        L11:
            copy(r3, r4, r0)
            return
    }

    @androidx.annotation.Nullable
    private androidx.exifinterface.media.ExifInterface.ExifAttribute getExifAttribute(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L24
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lc
            java.lang.String r3 = "PhotographicSensitivity"
        Lc:
            r0 = 0
        Ld:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L22
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            java.lang.Object r1 = r1.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r1 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 1
            goto Ld
        L22:
            r3 = 0
            return r3
        L24:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r3.<init>(r0)
            throw r3
    }

    private void getHeifAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L17
            r3 = 23
            if (r2 < r3) goto L1a
            androidx.exifinterface.media.ExifInterface$1 r2 = new androidx.exifinterface.media.ExifInterface$1     // Catch: java.lang.Throwable -> L17
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L17
            androidx.exifinterface.media.a.a(r1, r2)     // Catch: java.lang.Throwable -> L17
            goto L29
        L17:
            r11 = move-exception
            goto L126
        L1a:
            java.io.FileDescriptor r2 = r10.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L22
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L17
            goto L29
        L22:
            java.lang.String r2 = r10.mFilename     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L122
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L17
        L29:
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L17
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L17
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L17
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L17
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L5a
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L17
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L17
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L17
            goto L76
        L5a:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L73
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L17
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L17
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L17
            goto L76
        L73:
            r0 = 0
            r4 = r0
            r5 = r4
        L76:
            r6 = 0
            if (r0 == 0) goto L8c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r10.mAttributes     // Catch: java.lang.Throwable -> L17
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L17
            java.lang.String r8 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteOrder r9 = r10.mExifByteOrder     // Catch: java.lang.Throwable -> L17
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r9)     // Catch: java.lang.Throwable -> L17
            r7.put(r8, r0)     // Catch: java.lang.Throwable -> L17
        L8c:
            if (r4 == 0) goto La1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r10.mAttributes     // Catch: java.lang.Throwable -> L17
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L17
            java.lang.String r7 = "ImageLength"
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteOrder r8 = r10.mExifByteOrder     // Catch: java.lang.Throwable -> L17
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r8)     // Catch: java.lang.Throwable -> L17
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L17
        La1:
            r0 = 6
            if (r5 == 0) goto Lcb
            int r4 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L17
            r5 = 90
            if (r4 == r5) goto Lbb
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto Lb9
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto Lb6
            r4 = 1
            goto Lbc
        Lb6:
            r4 = 8
            goto Lbc
        Lb9:
            r4 = 3
            goto Lbc
        Lbb:
            r4 = 6
        Lbc:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r10.mAttributes     // Catch: java.lang.Throwable -> L17
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L17
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r8 = r10.mExifByteOrder     // Catch: java.lang.Throwable -> L17
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r8)     // Catch: java.lang.Throwable -> L17
            r5.put(r7, r4)     // Catch: java.lang.Throwable -> L17
        Lcb:
            if (r2 == 0) goto L11e
            if (r3 == 0) goto L11e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L17
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 <= r0) goto L116
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L17
            r11.seek(r4)     // Catch: java.lang.Throwable -> L17
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L17
            int r5 = r11.read(r4)     // Catch: java.lang.Throwable -> L17
            if (r5 != r0) goto L10e
            int r2 = r2 + r0
            int r3 = r3 + (-6)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1     // Catch: java.lang.Throwable -> L17
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L106
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> L17
            int r11 = r11.read(r0)     // Catch: java.lang.Throwable -> L17
            if (r11 != r3) goto Lfe
            r10.mOffsetToExifData = r2     // Catch: java.lang.Throwable -> L17
            r10.readExifSegment(r0, r6)     // Catch: java.lang.Throwable -> L17
            goto L11e
        Lfe:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Can't read exif"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L106:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Invalid identifier"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L10e:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Can't read identifier"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L116:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Invalid exif length"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L11e:
            r1.release()
            return
        L122:
            r1.release()
            return
        L126:
            r1.release()
            throw r11
    }

    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r19, int r20, int r21) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto Ld
            java.util.Objects.toString(r1)
        Ld:
            r3 = 0
            r1.mark(r3)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r4)
            byte r4 = r1.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L185
            byte r7 = r1.readByte()
            r8 = -40
            if (r7 != r8) goto L16a
            r4 = 2
        L28:
            byte r5 = r1.readByte()
            if (r5 != r6) goto L14d
            byte r5 = r1.readByte()
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L3b
            r8 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r8)
        L3b:
            r8 = -39
            if (r5 == r8) goto L147
            r8 = -38
            if (r5 != r8) goto L45
            goto L147
        L45:
            int r8 = r1.readUnsignedShort()
            int r9 = r8 + (-2)
            int r4 = r4 + 4
            if (r7 == 0) goto L54
            r7 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r7)
        L54:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L141
            r10 = -31
            r11 = 1
            if (r5 == r10) goto Ld4
            r10 = -2
            if (r5 == r10) goto La8
            switch(r5) {
                case -64: goto L6e;
                case -63: goto L6e;
                case -62: goto L6e;
                case -61: goto L6e;
                default: goto L63;
            }
        L63:
            switch(r5) {
                case -59: goto L6e;
                case -58: goto L6e;
                case -57: goto L6e;
                default: goto L66;
            }
        L66:
            switch(r5) {
                case -55: goto L6e;
                case -54: goto L6e;
                case -53: goto L6e;
                default: goto L69;
            }
        L69:
            switch(r5) {
                case -51: goto L6e;
                case -50: goto L6e;
                case -49: goto L6e;
                default: goto L6c;
            }
        L6c:
            goto L127
        L6e:
            int r5 = r1.skipBytes(r11)
            if (r5 != r11) goto La0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r2]
            int r9 = r1.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r9, r11)
            java.lang.String r10 = "ImageLength"
            r5.put(r10, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r2]
            int r9 = r1.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r9, r11)
            java.lang.String r10 = "ImageWidth"
            r5.put(r10, r9)
            int r9 = r8 + (-7)
            goto L127
        La0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        La8:
            byte[] r5 = new byte[r9]
            int r8 = r1.read(r5)
            if (r8 != r9) goto Lcc
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.getAttribute(r8)
            if (r9 != 0) goto Lca
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r11]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = androidx.exifinterface.media.ExifInterface.ASCII
            r10.<init>(r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r10)
            r9.put(r8, r5)
        Lca:
            r9 = 0
            goto L127
        Lcc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        Ld4:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r4 + r9
            byte[] r10 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r12 = startsWith(r5, r10)
            if (r12 == 0) goto Lfa
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r4 = r20 + r4
            int r9 = r10.length
            int r4 = r4 + r9
            r0.mOffsetToExifData = r4
            r0.readExifSegment(r5, r2)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r4 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r4.<init>(r5)
            r0.setThumbnailData(r4)
            goto L125
        Lfa:
            byte[] r10 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            boolean r12 = startsWith(r5, r10)
            if (r12 == 0) goto L125
            int r12 = r10.length
            int r4 = r4 + r12
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r10 = r0.getAttribute(r9)
            if (r10 != 0) goto L125
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r3]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            int r14 = r5.length
            long r3 = (long) r4
            r13 = 1
            r15 = r3
            r17 = r5
            r12.<init>(r13, r14, r15, r17)
            r10.put(r9, r12)
            r0.mXmpIsFromSeparateMarker = r11
        L125:
            r4 = r8
            goto Lca
        L127:
            if (r9 < 0) goto L13b
            int r3 = r1.skipBytes(r9)
            if (r3 != r9) goto L133
            int r4 = r4 + r9
            r3 = 0
            goto L28
        L133:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L13b:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L141:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L147:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            return
        L14d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L16a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L185:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private int getMimeType(java.io.BufferedInputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            r2.mark(r0)
            byte[] r0 = new byte[r0]
            r2.read(r0)
            r2.reset()
            boolean r2 = isJpegFormat(r0)
            if (r2 == 0) goto L15
            r2 = 4
            return r2
        L15:
            boolean r2 = r1.isRafFormat(r0)
            if (r2 == 0) goto L1e
            r2 = 9
            return r2
        L1e:
            boolean r2 = r1.isHeifFormat(r0)
            if (r2 == 0) goto L27
            r2 = 12
            return r2
        L27:
            boolean r2 = r1.isOrfFormat(r0)
            if (r2 == 0) goto L2f
            r2 = 7
            return r2
        L2f:
            boolean r2 = r1.isRw2Format(r0)
            if (r2 == 0) goto L38
            r2 = 10
            return r2
        L38:
            boolean r2 = r1.isPngFormat(r0)
            if (r2 == 0) goto L41
            r2 = 13
            return r2
        L41:
            boolean r2 = r1.isWebpFormat(r0)
            if (r2 == 0) goto L4a
            r2 = 14
            return r2
        L4a:
            r2 = 0
            return r2
    }

    private void getOrfAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r6) throws java.io.IOException {
            r5 = this;
            r5.getRawAttributes(r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r0 = 1
            r6 = r6[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r6 = r6.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto Ld8
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r6 = r6.bytes
            r1.<init>(r6)
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            r1.setByteOrder(r6)
            byte[] r6 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.seek(r3)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L3f
            r2 = 8
            r1.seek(r2)
            goto L4a
        L3f:
            boolean r6 = java.util.Arrays.equals(r4, r3)
            if (r6 == 0) goto L4a
            r2 = 12
            r1.seek(r2)
        L4a:
            r6 = 6
            r5.readImageFileDirectory(r1, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r1 = 7
            r6 = r6[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r5.mAttributes
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r6 == 0) goto L7e
            if (r1 == 0) goto L7e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r5.mAttributes
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r6 = r6[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r6.put(r2, r1)
        L7e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r1 = 8
            r6 = r6[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r6 = r6.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto Ld8
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r6 = r6.getValue(r1)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto Ld5
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L9d
            goto Ld5
        L9d:
            r1 = 2
            r1 = r6[r1]
            r2 = 0
            r3 = r6[r2]
            if (r1 <= r3) goto Ld8
            r4 = 3
            r4 = r6[r4]
            r6 = r6[r0]
            if (r4 <= r6) goto Ld8
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r4 = r4 - r6
            int r4 = r4 + r0
            if (r1 >= r4) goto Lb6
            int r1 = r1 + r4
            int r4 = r1 - r4
            int r1 = r1 - r4
        Lb6:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r6)
            java.nio.ByteOrder r0 = r5.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r5.mAttributes
            r1 = r1[r2]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r6 = r6[r2]
            java.lang.String r1 = "ImageLength"
            r6.put(r1, r0)
            return
        Ld5:
            java.util.Arrays.toString(r6)
        Ld8:
            return
    }

    private void getPngAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L7
            java.util.Objects.toString(r7)
        L7:
            r0 = 0
            r7.mark(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r7.setByteOrder(r1)
            byte[] r1 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r2 = r1.length
            r7.skipBytes(r2)
            int r1 = r1.length
        L17:
            int r2 = r7.readInt()     // Catch: java.io.EOFException -> Lc9
            r3 = 4
            byte[] r4 = new byte[r3]     // Catch: java.io.EOFException -> Lc9
            int r5 = r7.read(r4)     // Catch: java.io.EOFException -> Lc9
            if (r5 != r3) goto Lc1
            int r1 = r1 + 8
            r3 = 16
            if (r1 != r3) goto L3b
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR     // Catch: java.io.EOFException -> Lc9
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lc9
            if (r3 == 0) goto L33
            goto L3b
        L33:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Lc9
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Lc9
            throw r7     // Catch: java.io.EOFException -> Lc9
        L3b:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND     // Catch: java.io.EOFException -> Lc9
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lc9
            if (r3 == 0) goto L44
            return
        L44:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> Lc9
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lc9
            if (r3 == 0) goto Lb9
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> Lc9
            int r5 = r7.read(r3)     // Catch: java.io.EOFException -> Lc9
            if (r5 != r2) goto L9e
            int r7 = r7.readInt()     // Catch: java.io.EOFException -> Lc9
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32     // Catch: java.io.EOFException -> Lc9
            r2.<init>()     // Catch: java.io.EOFException -> Lc9
            r2.update(r4)     // Catch: java.io.EOFException -> Lc9
            r2.update(r3)     // Catch: java.io.EOFException -> Lc9
            long r4 = r2.getValue()     // Catch: java.io.EOFException -> Lc9
            int r5 = (int) r4     // Catch: java.io.EOFException -> Lc9
            if (r5 != r7) goto L7b
            r6.mOffsetToExifData = r1     // Catch: java.io.EOFException -> Lc9
            r6.readExifSegment(r3, r0)     // Catch: java.io.EOFException -> Lc9
            r6.validateImages()     // Catch: java.io.EOFException -> Lc9
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> Lc9
            r7.<init>(r3)     // Catch: java.io.EOFException -> Lc9
            r6.setThumbnailData(r7)     // Catch: java.io.EOFException -> Lc9
            return
        L7b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lc9
            r1.<init>()     // Catch: java.io.EOFException -> Lc9
            java.lang.String r3 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r1.append(r3)     // Catch: java.io.EOFException -> Lc9
            r1.append(r7)     // Catch: java.io.EOFException -> Lc9
            java.lang.String r7 = ", calculated CRC value: "
            r1.append(r7)     // Catch: java.io.EOFException -> Lc9
            long r2 = r2.getValue()     // Catch: java.io.EOFException -> Lc9
            r1.append(r2)     // Catch: java.io.EOFException -> Lc9
            java.lang.String r7 = r1.toString()     // Catch: java.io.EOFException -> Lc9
            r0.<init>(r7)     // Catch: java.io.EOFException -> Lc9
            throw r0     // Catch: java.io.EOFException -> Lc9
        L9e:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lc9
            r0.<init>()     // Catch: java.io.EOFException -> Lc9
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> Lc9
            java.lang.String r1 = byteArrayToHexString(r4)     // Catch: java.io.EOFException -> Lc9
            r0.append(r1)     // Catch: java.io.EOFException -> Lc9
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> Lc9
            r7.<init>(r0)     // Catch: java.io.EOFException -> Lc9
            throw r7     // Catch: java.io.EOFException -> Lc9
        Lb9:
            int r2 = r2 + 4
            r7.skipBytes(r2)     // Catch: java.io.EOFException -> Lc9
            int r1 = r1 + r2
            goto L17
        Lc1:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Lc9
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Lc9
            throw r7     // Catch: java.io.EOFException -> Lc9
        Lc9:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt PNG file."
            r7.<init>(r0)
            throw r7
    }

    private void getRafAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L7
            java.util.Objects.toString(r7)
        L7:
            r0 = 0
            r7.mark(r0)
            r1 = 84
            r7.skipBytes(r1)
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            byte[] r1 = new byte[r1]
            r7.read(r2)
            r7.read(r3)
            r7.read(r1)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            int r2 = r2.getInt()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            int r3 = r3.getInt()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            int r1 = r1.getInt()
            byte[] r3 = new byte[r3]
            long r4 = (long) r2
            r7.seek(r4)
            r7.read(r3)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r4 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r4.<init>(r3)
            r3 = 5
            r6.getJpegAttributes(r4, r2, r3)
            long r1 = (long) r1
            r7.seek(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r7.setByteOrder(r1)
            int r1 = r7.readInt()
            r2 = 0
        L58:
            if (r2 >= r1) goto L95
            int r3 = r7.readUnsignedShort()
            int r4 = r7.readUnsignedShort()
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE
            int r5 = r5.number
            if (r3 != r5) goto L8f
            short r1 = r7.readShort()
            short r7 = r7.readShort()
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r2)
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r7, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r0]
            java.lang.String r3 = "ImageLength"
            r2.put(r3, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r0 = r1[r0]
            java.lang.String r1 = "ImageWidth"
            r0.put(r1, r7)
            return
        L8f:
            r7.skipBytes(r4)
            int r2 = r2 + 1
            goto L58
        L95:
            return
    }

    private void getRawAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.available()
            r4.parseTiffHeaders(r5, r0)
            r0 = 0
            r4.readImageFileDirectory(r5, r0)
            r4.updateImageSizeValues(r5, r0)
            r0 = 5
            r4.updateImageSizeValues(r5, r0)
            r0 = 4
            r4.updateImageSizeValues(r5, r0)
            r4.validateImages()
            int r5 = r4.mMimeType
            r0 = 8
            if (r5 != r0) goto L59
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r0 = 1
            r5 = r5[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L59
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r5 = r5.bytes
            r1.<init>(r5)
            java.nio.ByteOrder r5 = r4.mExifByteOrder
            r1.setByteOrder(r5)
            r2 = 6
            r1.seek(r2)
            r5 = 9
            r4.readImageFileDirectory(r1, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r5 = r1[r5]
            java.lang.String r1 = "ColorSpace"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L59
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes
            r0 = r2[r0]
            r0.put(r1, r5)
        L59:
            return
    }

    private void getRw2Attributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L7
            java.util.Objects.toString(r5)
        L7:
            r4.getRawAttributes(r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r0 = 0
            r5 = r5[r0]
            java.lang.String r1 = "JpgFromRaw"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L27
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r2 = r5.bytes
            r1.<init>(r2)
            long r2 = r5.bytesOffset
            int r5 = (int) r2
            r2 = 5
            r4.getJpegAttributes(r1, r5, r2)
        L27:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r5 = r5[r0]
            java.lang.String r0 = "ISO"
            java.lang.Object r5 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 1
            r0 = r0[r1]
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r5 == 0) goto L4b
            if (r0 != 0) goto L4b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r1]
            r0.put(r2, r5)
        L4b:
            return
    }

    private void getStandaloneAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r3.skipBytes(r1)
            int r1 = r3.available()
            byte[] r1 = new byte[r1]
            r3.readFully(r1)
            int r3 = r0.length
            r2.mOffsetToExifData = r3
            r3 = 0
            r2.readExifSegment(r1, r3)
            return
    }

    private void getWebpAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L7
            java.util.Objects.toString(r7)
        L7:
            r0 = 0
            r7.mark(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r7.setByteOrder(r1)
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r1 = r1.length
            r7.skipBytes(r1)
            int r1 = r7.readInt()
            int r1 = r1 + 8
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r2 = r2.length
            int r2 = r7.skipBytes(r2)
            int r2 = r2 + 8
        L25:
            r3 = 4
            byte[] r4 = new byte[r3]     // Catch: java.io.EOFException -> L99
            int r5 = r7.read(r4)     // Catch: java.io.EOFException -> L99
            if (r5 != r3) goto L91
            int r3 = r7.readInt()     // Catch: java.io.EOFException -> L99
            int r2 = r2 + 8
            byte[] r5 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> L99
            boolean r5 = java.util.Arrays.equals(r5, r4)     // Catch: java.io.EOFException -> L99
            if (r5 == 0) goto L6d
            byte[] r1 = new byte[r3]     // Catch: java.io.EOFException -> L99
            int r7 = r7.read(r1)     // Catch: java.io.EOFException -> L99
            if (r7 != r3) goto L52
            r6.mOffsetToExifData = r2     // Catch: java.io.EOFException -> L99
            r6.readExifSegment(r1, r0)     // Catch: java.io.EOFException -> L99
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> L99
            r7.<init>(r1)     // Catch: java.io.EOFException -> L99
            r6.setThumbnailData(r7)     // Catch: java.io.EOFException -> L99
            return
        L52:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L99
            r0.<init>()     // Catch: java.io.EOFException -> L99
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> L99
            java.lang.String r1 = byteArrayToHexString(r4)     // Catch: java.io.EOFException -> L99
            r0.append(r1)     // Catch: java.io.EOFException -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> L99
            r7.<init>(r0)     // Catch: java.io.EOFException -> L99
            throw r7     // Catch: java.io.EOFException -> L99
        L6d:
            int r4 = r3 % 2
            r5 = 1
            if (r4 != r5) goto L74
            int r3 = r3 + 1
        L74:
            int r4 = r2 + r3
            if (r4 != r1) goto L79
            return
        L79:
            java.lang.String r5 = "Encountered WebP file with invalid chunk size"
            if (r4 > r1) goto L8b
            int r4 = r7.skipBytes(r3)     // Catch: java.io.EOFException -> L99
            if (r4 != r3) goto L85
            int r2 = r2 + r4
            goto L25
        L85:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> L99
            r7.<init>(r5)     // Catch: java.io.EOFException -> L99
            throw r7     // Catch: java.io.EOFException -> L99
        L8b:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> L99
            r7.<init>(r5)     // Catch: java.io.EOFException -> L99
            throw r7     // Catch: java.io.EOFException -> L99
        L91:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> L99
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            r7.<init>(r0)     // Catch: java.io.EOFException -> L99
            throw r7     // Catch: java.io.EOFException -> L99
        L99:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt WebP file."
            r7.<init>(r0)
            throw r7
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r13) {
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = ","
            boolean r8 = r13.contains(r7)
            r9 = 0
            r10 = 1
            if (r8 == 0) goto Lb6
            java.lang.String[] r13 = r13.split(r7, r5)
            r0 = r13[r9]
            android.util.Pair r0 = guessDataFormat(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L39
            return r0
        L39:
            int r1 = r13.length
            if (r10 >= r1) goto Lb5
            r1 = r13[r10]
            android.util.Pair r1 = guessDataFormat(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r0.first
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r0.first
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5b
            goto L5d
        L5b:
            r2 = -1
            goto L65
        L5d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L65:
            java.lang.Object r3 = r0.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 == r5) goto L90
            java.lang.Object r3 = r1.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r7 = r0.second
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L87
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r3 = r0.second
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L90
        L87:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L91
        L90:
            r1 = -1
        L91:
            if (r2 != r5) goto L9b
            if (r1 != r5) goto L9b
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r4, r6)
            return r13
        L9b:
            if (r2 != r5) goto La7
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r6)
            goto Lb2
        La7:
            if (r1 != r5) goto Lb2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r6)
        Lb2:
            int r10 = r10 + 1
            goto L39
        Lb5:
            return r0
        Lb6:
            java.lang.String r7 = "/"
            boolean r8 = r13.contains(r7)
            r11 = 0
            if (r8 == 0) goto L102
            java.lang.String[] r13 = r13.split(r7, r5)
            int r0 = r13.length
            if (r0 != r3) goto Lfc
            r0 = r13[r9]     // Catch: java.lang.NumberFormatException -> Lfc
            double r7 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lfc
            long r7 = (long) r7     // Catch: java.lang.NumberFormatException -> Lfc
            r13 = r13[r10]     // Catch: java.lang.NumberFormatException -> Lfc
            double r9 = java.lang.Double.parseDouble(r13)     // Catch: java.lang.NumberFormatException -> Lfc
            long r9 = (long) r9     // Catch: java.lang.NumberFormatException -> Lfc
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto Lf6
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto Lde
            goto Lf6
        Lde:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 > 0) goto Lf0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto Lea
            goto Lf0
        Lea:
            android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
            r13.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> Lfc
            return r13
        Lf0:
            android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
            r13.<init>(r1, r6)     // Catch: java.lang.NumberFormatException -> Lfc
            return r13
        Lf6:
            android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lfc
            r13.<init>(r2, r6)     // Catch: java.lang.NumberFormatException -> Lfc
            return r13
        Lfc:
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r4, r6)
            return r13
        L102:
            long r1 = java.lang.Long.parseLong(r13)     // Catch: java.lang.NumberFormatException -> L130
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 < 0) goto L11c
            r7 = 65535(0xffff, double:3.23786E-319)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 > 0) goto L11c
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L130
            r1.<init>(r2, r0)     // Catch: java.lang.NumberFormatException -> L130
            return r1
        L11c:
            if (r3 >= 0) goto L12a
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L130
            r0.<init>(r1, r6)     // Catch: java.lang.NumberFormatException -> L130
            return r0
        L12a:
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L130
            r1.<init>(r0, r6)     // Catch: java.lang.NumberFormatException -> L130
            return r1
        L130:
            java.lang.Double.parseDouble(r13)     // Catch: java.lang.NumberFormatException -> L13f
            android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L13f
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L13f
            r13.<init>(r0, r6)     // Catch: java.lang.NumberFormatException -> L13f
            return r13
        L13f:
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r4, r6)
            return r13
    }

    private void handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5, java.util.HashMap r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r6.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r6 = r6.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r0 == 0) goto L53
            if (r6 == 0) goto L53
            java.nio.ByteOrder r1 = r4.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r4.mExifByteOrder
            int r6 = r6.getIntValue(r1)
            int r1 = r4.mMimeType
            r2 = 7
            if (r1 != r2) goto L28
            int r1 = r4.mOrfMakerNoteOffset
            int r0 = r0 + r1
        L28:
            int r1 = r5.getLength()
            int r1 = r1 - r0
            int r6 = java.lang.Math.min(r6, r1)
            if (r0 <= 0) goto L53
            if (r6 <= 0) goto L53
            r1 = 1
            r4.mHasThumbnail = r1
            java.lang.String r1 = r4.mFilename
            if (r1 != 0) goto L4f
            android.content.res.AssetManager$AssetInputStream r1 = r4.mAssetInputStream
            if (r1 != 0) goto L4f
            java.io.FileDescriptor r1 = r4.mSeekableFileDescriptor
            if (r1 != 0) goto L4f
            byte[] r1 = new byte[r6]
            long r2 = (long) r0
            r5.skip(r2)
            r5.read(r1)
            r4.mThumbnailBytes = r1
        L4f:
            r4.mThumbnailOffset = r0
            r4.mThumbnailLength = r6
        L53:
            return
    }

    private void handleThumbnailFromStrips(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r19, java.util.HashMap r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.lang.String r4 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            if (r3 == 0) goto La1
            if (r2 == 0) goto La1
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.Object r3 = r3.getValue(r4)
            long[] r3 = convertToLongArray(r3)
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.Object r2 = r2.getValue(r4)
            long[] r2 = convertToLongArray(r2)
            if (r3 == 0) goto La1
            int r4 = r3.length
            if (r4 != 0) goto L35
            goto La1
        L35:
            if (r2 == 0) goto La1
            int r4 = r2.length
            if (r4 != 0) goto L3b
            goto La1
        L3b:
            int r4 = r3.length
            int r5 = r2.length
            if (r4 == r5) goto L40
            return
        L40:
            int r4 = r2.length
            r5 = 0
            r6 = 0
            r8 = 0
        L45:
            if (r8 >= r4) goto L4d
            r9 = r2[r8]
            long r6 = r6 + r9
            int r8 = r8 + 1
            goto L45
        L4d:
            int r4 = (int) r6
            byte[] r6 = new byte[r4]
            r7 = 1
            r0.mAreThumbnailStripsConsecutive = r7
            r0.mHasThumbnailStrips = r7
            r0.mHasThumbnail = r7
            r8 = 0
            r9 = 0
            r10 = 0
        L5a:
            int r11 = r3.length
            if (r8 >= r11) goto L94
            r11 = r3[r8]
            int r12 = (int) r11
            r13 = r2[r8]
            int r11 = (int) r13
            int r13 = r3.length
            int r13 = r13 - r7
            if (r8 >= r13) goto L74
            int r13 = r12 + r11
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L74
            r0.mAreThumbnailStripsConsecutive = r5
        L74:
            int r12 = r12 - r9
            if (r12 >= 0) goto L78
            return
        L78:
            long r13 = (long) r12
            long r15 = r1.skip(r13)
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L82
            return
        L82:
            int r9 = r9 + r12
            byte[] r12 = new byte[r11]
            int r13 = r1.read(r12)
            if (r13 == r11) goto L8c
            return
        L8c:
            int r9 = r9 + r11
            java.lang.System.arraycopy(r12, r5, r6, r10, r11)
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L5a
        L94:
            r0.mThumbnailBytes = r6
            boolean r1 = r0.mAreThumbnailStripsConsecutive
            if (r1 == 0) goto La1
            r1 = r3[r5]
            int r2 = (int) r1
            r0.mThumbnailOffset = r2
            r0.mThumbnailLength = r4
        La1:
            return
    }

    private void initForFilename(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L2e
            r0 = 0
            r2.mAssetInputStream = r0
            r2.mFilename = r3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L29
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L29
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L1d
            boolean r3 = isSeekableFD(r3)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L1d
            r2.mSeekableFileDescriptor = r3     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            r3 = move-exception
            r0 = r1
            goto L2a
        L20:
            r2.mSeekableFileDescriptor = r0     // Catch: java.lang.Throwable -> L1d
        L22:
            r2.loadAttributes(r1)     // Catch: java.lang.Throwable -> L1d
            closeQuietly(r1)
            return
        L29:
            r3 = move-exception
        L2a:
            closeQuietly(r0)
            throw r3
        L2e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
    }

    private static boolean isExifDataOnly(java.io.BufferedInputStream r4) throws java.io.IOException {
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r4.mark(r1)
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r4.read(r0)
            r4.reset()
            r4 = 0
            r1 = 0
        L11:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r3 = r2.length
            if (r1 >= r3) goto L20
            r3 = r0[r1]
            r2 = r2[r1]
            if (r3 == r2) goto L1d
            return r4
        L1d:
            int r1 = r1 + 1
            goto L11
        L20:
            r4 = 1
            return r4
    }

    private boolean isHeifFormat(byte[] r15) throws java.io.IOException {
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r2.read(r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            byte[] r6 = androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r5 != 0) goto L1e
            r2.close()
            return r0
        L1e:
            r5 = 8
            r7 = 1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L3a
            long r3 = r2.readLong()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r9 = 16
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3b
            r2.close()
            return r0
        L34:
            r15 = move-exception
            r1 = r2
            goto L8f
        L37:
            r1 = r2
            goto L95
        L3a:
            r9 = r5
        L3b:
            int r11 = r15.length     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L43
            int r15 = r15.length     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            long r3 = (long) r15
        L43:
            long r3 = r3 - r9
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 >= 0) goto L4c
            r2.close()
            return r0
        L4c:
            byte[] r15 = new byte[r1]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r5 = 0
            r9 = 0
            r10 = 0
        L52:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L87
            int r11 = r2.read(r15)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r11 == r1) goto L64
            r2.close()
            return r0
        L64:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L69
            goto L85
        L69:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r12 = 1
            if (r11 == 0) goto L74
            r9 = 1
            goto L7d
        L74:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r11 == 0) goto L7d
            r10 = 1
        L7d:
            if (r9 == 0) goto L85
            if (r10 == 0) goto L85
            r2.close()
            return r12
        L85:
            long r5 = r5 + r7
            goto L52
        L87:
            r2.close()
            goto L9a
        L8b:
            r15 = move-exception
            goto L8f
        L8d:
            goto L95
        L8f:
            if (r1 == 0) goto L94
            r1.close()
        L94:
            throw r15
        L95:
            if (r1 == 0) goto L9a
            r1.close()
        L9a:
            return r0
    }

    private static boolean isJpegFormat(byte[] r4) throws java.io.IOException {
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r4[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r4 = 1
            return r4
    }

    private boolean isOrfFormat(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L1c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.close()
            return r0
        L21:
            r4 = move-exception
            r1 = r2
            goto L2b
        L24:
            r1 = r2
            goto L31
        L27:
            r4 = move-exception
            goto L2b
        L29:
            goto L31
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            throw r4
        L31:
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
    }

    private boolean isPngFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r5 = 1
            return r5
    }

    private boolean isRafFormat(byte[] r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r1)
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            r3 = r6[r2]
            r4 = r0[r2]
            if (r3 == r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto Lc
        L19:
            r6 = 1
            return r6
    }

    private boolean isRw2Format(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r1 = 85
            if (r4 != r1) goto L19
            r0 = 1
        L19:
            r2.close()
            return r0
        L1d:
            r4 = move-exception
            r1 = r2
            goto L27
        L20:
            r1 = r2
            goto L2d
        L23:
            r4 = move-exception
            goto L27
        L25:
            goto L2d
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r4
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
    }

    private static boolean isSeekableFD(java.io.FileDescriptor r3) {
            int r0 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L9
            r1 = 0
            android.system.Os.lseek(r3, r1, r0)     // Catch: java.lang.Exception -> L9
            r3 = 1
            return r3
        L9:
            r3 = 0
            return r3
    }

    private boolean isSupportedDataType(java.util.HashMap r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "BitsPerSample"
            java.lang.Object r0 = r6.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L45
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r0 = r0.getValue(r1)
            int[] r0 = (int[]) r0
            int[] r1 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB
            boolean r2 = java.util.Arrays.equals(r1, r0)
            r3 = 1
            if (r2 == 0) goto L1c
            return r3
        L1c:
            int r2 = r5.mMimeType
            r4 = 3
            if (r2 != r4) goto L45
            java.lang.String r2 = "PhotometricInterpretation"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto L45
            java.nio.ByteOrder r2 = r5.mExifByteOrder
            int r6 = r6.getIntValue(r2)
            if (r6 != r3) goto L3b
            int[] r2 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 != 0) goto L44
        L3b:
            r2 = 6
            if (r6 != r2) goto L45
            boolean r6 = java.util.Arrays.equals(r0, r1)
            if (r6 == 0) goto L45
        L44:
            return r3
        L45:
            r6 = 0
            return r6
    }

    private boolean isSupportedFormatForSavingAttributes() {
            r2 = this;
            int r0 = r2.mMimeType
            r1 = 4
            if (r0 == r1) goto L10
            r1 = 13
            if (r0 == r1) goto L10
            r1 = 14
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = 1
            return r0
    }

    public static boolean isSupportedMimeType(@androidx.annotation.NonNull java.lang.String r4) {
            if (r4 == 0) goto Ld5
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -1875291391: goto Lc6;
                case -1635437028: goto Lbb;
                case -1594371159: goto Lb0;
                case -1487464693: goto La5;
                case -1487464690: goto L9a;
                case -1487394660: goto L8f;
                case -1487018032: goto L84;
                case -1423313290: goto L79;
                case -985160897: goto L6b;
                case -879258763: goto L5d;
                case -332763809: goto L4f;
                case 1378106698: goto L41;
                case 2099152104: goto L33;
                case 2099152524: goto L25;
                case 2111234748: goto L17;
                default: goto L15;
            }
        L15:
            goto Ld0
        L17:
            java.lang.String r0 = "image/x-canon-cr2"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L21
            goto Ld0
        L21:
            r3 = 14
            goto Ld0
        L25:
            java.lang.String r0 = "image/x-nikon-nrw"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2f
            goto Ld0
        L2f:
            r3 = 13
            goto Ld0
        L33:
            java.lang.String r0 = "image/x-nikon-nef"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3d
            goto Ld0
        L3d:
            r3 = 12
            goto Ld0
        L41:
            java.lang.String r0 = "image/x-olympus-orf"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4b
            goto Ld0
        L4b:
            r3 = 11
            goto Ld0
        L4f:
            java.lang.String r0 = "image/x-pentax-pef"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L59
            goto Ld0
        L59:
            r3 = 10
            goto Ld0
        L5d:
            java.lang.String r0 = "image/png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L67
            goto Ld0
        L67:
            r3 = 9
            goto Ld0
        L6b:
            java.lang.String r0 = "image/x-panasonic-rw2"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L75
            goto Ld0
        L75:
            r3 = 8
            goto Ld0
        L79:
            java.lang.String r0 = "image/x-adobe-dng"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L82
            goto Ld0
        L82:
            r3 = 7
            goto Ld0
        L84:
            java.lang.String r0 = "image/webp"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L8d
            goto Ld0
        L8d:
            r3 = 6
            goto Ld0
        L8f:
            java.lang.String r0 = "image/jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L98
            goto Ld0
        L98:
            r3 = 5
            goto Ld0
        L9a:
            java.lang.String r0 = "image/heif"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La3
            goto Ld0
        La3:
            r3 = 4
            goto Ld0
        La5:
            java.lang.String r0 = "image/heic"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lae
            goto Ld0
        Lae:
            r3 = 3
            goto Ld0
        Lb0:
            java.lang.String r0 = "image/x-sony-arw"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb9
            goto Ld0
        Lb9:
            r3 = 2
            goto Ld0
        Lbb:
            java.lang.String r0 = "image/x-samsung-srw"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc4
            goto Ld0
        Lc4:
            r3 = 1
            goto Ld0
        Lc6:
            java.lang.String r0 = "image/x-fuji-raf"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcf
            goto Ld0
        Lcf:
            r3 = 0
        Ld0:
            switch(r3) {
                case 0: goto Ld4;
                case 1: goto Ld4;
                case 2: goto Ld4;
                case 3: goto Ld4;
                case 4: goto Ld4;
                case 5: goto Ld4;
                case 6: goto Ld4;
                case 7: goto Ld4;
                case 8: goto Ld4;
                case 9: goto Ld4;
                case 10: goto Ld4;
                case 11: goto Ld4;
                case 12: goto Ld4;
                case 13: goto Ld4;
                case 14: goto Ld4;
                default: goto Ld3;
            }
        Ld3:
            return r2
        Ld4:
            return r1
        Ld5:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "mimeType shouldn't be null"
            r4.<init>(r0)
            throw r4
    }

    private boolean isThumbnail(java.util.HashMap r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "ImageLength"
            java.lang.Object r0 = r3.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r3 = r3.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r3 = r3.getIntValue(r1)
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            if (r3 > r1) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    private boolean isWebpFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r1 = 0
        L12:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r3 = r2.length
            if (r1 >= r3) goto L27
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r3.length
            int r3 = r3 + r1
            int r3 = r3 + 4
            r3 = r5[r3]
            r2 = r2[r1]
            if (r3 == r2) goto L24
            return r0
        L24:
            int r1 = r1 + 1
            goto L12
        L27:
            r5 = 1
            return r5
    }

    private void loadAttributes(@androidx.annotation.NonNull java.io.InputStream r5) {
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = 0
        L4:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            if (r1 >= r2) goto L18
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            boolean r1 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            if (r1 != 0) goto L2a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            int r5 = r4.getMimeType(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.mMimeType = r5     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r5 = r1
        L2a:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            boolean r5 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            if (r5 != 0) goto L8b
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            switch(r5) {
                case 0: goto L87;
                case 1: goto L87;
                case 2: goto L87;
                case 3: goto L87;
                case 4: goto L79;
                case 5: goto L87;
                case 6: goto L87;
                case 7: goto L75;
                case 8: goto L87;
                case 9: goto L67;
                case 10: goto L59;
                case 11: goto L87;
                case 12: goto L55;
                case 13: goto L47;
                case 14: goto L39;
                default: goto L38;
            }     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
        L38:
            goto L8e
        L39:
            r4.getWebpAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        L47:
            r4.getPngAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        L55:
            r4.getHeifAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            goto L8e
        L59:
            r4.getRw2Attributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        L67:
            r4.getRafAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        L75:
            r4.getOrfAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            goto L8e
        L79:
            r4.getJpegAttributes(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        L87:
            r4.getRawAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            goto L8e
        L8b:
            r4.getStandaloneAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
        L8e:
            int r5 = r4.mOffsetToExifData     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r1.seek(r2)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.setThumbnailData(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> La2
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lac
            r4.printAttributes()
            return
        La2:
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L15
            r4.addDefaultValuesForCompatibility()
            if (r5 == 0) goto Lac
            r4.printAttributes()
        Lac:
            return
        Lad:
            r4.addDefaultValuesForCompatibility()
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto Lb7
            r4.printAttributes()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
    }

    private static java.lang.Long parseDateTime(@androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String r11, @androidx.annotation.Nullable java.lang.String r12) {
            r0 = 0
            if (r10 == 0) goto L90
            java.util.regex.Pattern r1 = androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L11
            goto L90
        L11:
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary     // Catch: java.lang.IllegalArgumentException -> L90
            java.util.Date r3 = r3.parse(r10, r1)     // Catch: java.lang.IllegalArgumentException -> L90
            if (r3 != 0) goto L28
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterSecondary     // Catch: java.lang.IllegalArgumentException -> L90
            java.util.Date r3 = r3.parse(r10, r1)     // Catch: java.lang.IllegalArgumentException -> L90
            if (r3 != 0) goto L28
            return r0
        L28:
            long r3 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L90
            if (r12 == 0) goto L7a
            r10 = 1
            java.lang.String r1 = r12.substring(r2, r10)     // Catch: java.lang.IllegalArgumentException -> L90
            r2 = 3
            java.lang.String r5 = r12.substring(r10, r2)     // Catch: java.lang.IllegalArgumentException -> L90
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.IllegalArgumentException -> L90
            r6 = 6
            r7 = 4
            java.lang.String r6 = r12.substring(r7, r6)     // Catch: java.lang.IllegalArgumentException -> L90
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.IllegalArgumentException -> L90
            java.lang.String r8 = "+"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L90
            java.lang.String r9 = "-"
            if (r8 != 0) goto L56
            boolean r8 = r9.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L90
            if (r8 == 0) goto L7a
        L56:
            java.lang.String r8 = ":"
            java.lang.String r12 = r12.substring(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L90
            boolean r12 = r8.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L90
            if (r12 == 0) goto L7a
            r12 = 14
            if (r5 > r12) goto L7a
            int r5 = r5 * 60
            int r5 = r5 + r6
            r12 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 * r12
            boolean r12 = r9.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L90
            if (r12 == 0) goto L75
            goto L76
        L75:
            r10 = -1
        L76:
            int r5 = r5 * r10
            long r1 = (long) r5
            long r3 = r3 + r1
        L7a:
            if (r11 == 0) goto L8b
            long r10 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L8b java.lang.IllegalArgumentException -> L90
        L80:
            r1 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 <= 0) goto L8a
            r1 = 10
            long r10 = r10 / r1
            goto L80
        L8a:
            long r3 = r3 + r10
        L8b:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L90
            return r10
        L90:
            return r0
    }

    private void parseTiffHeaders(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            java.nio.ByteOrder r0 = r3.readByteOrder(r4)
            r3.mExifByteOrder = r0
            r4.setByteOrder(r0)
            int r0 = r4.readUnsignedShort()
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 == r2) goto L36
            r2 = 10
            if (r1 == r2) goto L36
            r1 = 42
            if (r0 != r1) goto L1b
            goto L36
        L1b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Invalid start code: "
            r5.append(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            int r0 = r4.readInt()
            r1 = 8
            if (r0 < r1) goto L63
            if (r0 >= r5) goto L63
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L62
            int r4 = r4.skipBytes(r0)
            if (r4 != r0) goto L4b
            goto L62
        L4b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Couldn't jump to first Ifd: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Invalid first Ifd offset: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private void printAttributes() {
            r4 = this;
            r0 = 0
        L1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            int r1 = r1.length
            if (r0 >= r1) goto L3d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r0]
            r1.size()
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r0]
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.toString()
            java.nio.ByteOrder r2 = r4.mExifByteOrder
            r3.getStringValue(r2)
            goto L19
        L3a:
            int r0 = r0 + 1
            goto L1
        L3d:
            return
    }

    private java.nio.ByteOrder readByteOrder(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            short r4 = r4.readShort()
            r0 = 18761(0x4949, float:2.629E-41)
            if (r4 == r0) goto L2a
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r4 != r0) goto Lf
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            return r4
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r4
    }

    private void readExifSegment(byte[] r2, int r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.parseTiffHeaders(r0, r2)
            r1.readImageFileDirectory(r0, r3)
            return
    }

    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r30, int r31) throws java.io.IOException {
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r1.mPosition
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.mPosition
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.mLength
            if (r3 <= r5) goto L1b
            goto L2bd
        L1b:
            short r3 = r1.readShort()
            int r5 = r1.mPosition
            int r6 = r3 * 12
            int r5 = r5 + r6
            int r6 = r1.mLength
            if (r5 > r6) goto L2bd
            if (r3 > 0) goto L2c
            goto L2bd
        L2c:
            r6 = 0
        L2d:
            r7 = 5
            r11 = 4
            if (r6 >= r3) goto L263
            int r12 = r1.readUnsignedShort()
            int r13 = r1.readUnsignedShort()
            int r14 = r1.readInt()
            int r15 = r1.peek()
            r21 = r6
            r20 = 0
            long r5 = (long) r15
            r15 = 4
            long r5 = r5 + r15
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r17 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r18 = 0
            r9 = r17[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.Object r9 = r9.get(r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = (androidx.exifinterface.media.ExifInterface.ExifTag) r9
            boolean r10 = androidx.exifinterface.media.ExifInterface.DEBUG
            r17 = 1
            r8 = 3
            if (r10 == 0) goto L8a
            java.lang.Integer r22 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r24 = r15
            if (r9 == 0) goto L6f
            java.lang.String r15 = r9.name
            goto L70
        L6f:
            r15 = 0
        L70:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r20] = r22
            r7[r17] = r23
            r7[r4] = r15
            r7[r8] = r16
            r7[r11] = r26
            java.lang.String r15 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r15, r7)
            goto L8c
        L8a:
            r24 = r15
        L8c:
            r7 = 7
            if (r9 != 0) goto L95
        L8f:
            r23 = r9
            r16 = r12
            r4 = 4
            goto Lcb
        L95:
            if (r13 <= 0) goto L8f
            int[] r15 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
            int r4 = r15.length
            if (r13 < r4) goto L9d
            goto L8f
        L9d:
            boolean r4 = r9.isFormatCompatible(r13)
            if (r4 != 0) goto Laa
            if (r10 == 0) goto L8f
            java.lang.String[] r4 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            r4 = r4[r13]
            goto L8f
        Laa:
            if (r13 != r7) goto Lae
            int r13 = r9.primaryFormat
        Lae:
            r16 = r12
            r4 = 4
            long r11 = (long) r14
            r15 = r15[r13]
            r23 = r9
            long r8 = (long) r15
            long r11 = r11 * r8
            int r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r8 < 0) goto Lc8
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r15 <= 0) goto Lc5
            goto Lc8
        Lc5:
            r15 = r13
            r8 = 1
            goto Lcf
        Lc8:
            r15 = r13
        Lc9:
            r8 = 0
            goto Lcf
        Lcb:
            r15 = r13
            r11 = r18
            goto Lc9
        Lcf:
            if (r8 != 0) goto Ld9
            r1.seek(r5)
            r24 = r3
        Ld6:
            r9 = 2
            goto L259
        Ld9:
            java.lang.String r8 = "Compression"
            int r9 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r9 <= 0) goto L165
            int r9 = r1.readInt()
            int r13 = r0.mMimeType
            if (r13 != r7) goto L148
            java.lang.String r7 = "MakerNote"
            r13 = r23
            r23 = 4
            java.lang.String r4 = r13.name
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto Lfe
            r0.mOrfMakerNoteOffset = r9
        Lf7:
            r24 = r3
            r25 = r10
            r27 = r11
            goto L152
        Lfe:
            r4 = 6
            if (r2 != r4) goto Lf7
            java.lang.String r7 = "ThumbnailImage"
            java.lang.String r4 = r13.name
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto Lf7
            r0.mOrfThumbnailOffset = r9
            r0.mOrfThumbnailLength = r14
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            r7 = 6
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r7, r4)
            int r7 = r0.mOrfThumbnailOffset
            r24 = r3
            long r2 = (long) r7
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r2, r7)
            int r3 = r0.mOrfThumbnailLength
            r25 = r10
            r27 = r11
            long r10 = (long) r3
            java.nio.ByteOrder r3 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r10, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r23]
            r7.put(r8, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r23]
            java.lang.String r7 = "JPEGInterchangeFormat"
            r4.put(r7, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r23]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
            goto L152
        L148:
            r24 = r3
            r25 = r10
            r27 = r11
            r13 = r23
            r23 = 4
        L152:
            long r2 = (long) r9
            long r11 = r2 + r27
            int r4 = r1.mLength
            long r9 = (long) r4
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 > 0) goto L160
            r1.seek(r2)
            goto L16f
        L160:
            r1.seek(r5)
            goto Ld6
        L165:
            r24 = r3
            r25 = r10
            r27 = r11
            r13 = r23
            r23 = 4
        L16f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            if (r2 == 0) goto L1e4
            r4 = 3
            if (r15 == r4) goto L1a2
            r4 = 4
            if (r15 == r4) goto L19d
            if (r15 == r3) goto L198
            r3 = 9
            if (r15 == r3) goto L192
            r3 = 13
            if (r15 == r3) goto L192
            r3 = -1
            goto L1a7
        L192:
            int r3 = r1.readInt()
        L196:
            long r3 = (long) r3
            goto L1a7
        L198:
            short r3 = r1.readShort()
            goto L196
        L19d:
            long r3 = r1.readUnsignedInt()
            goto L1a7
        L1a2:
            int r3 = r1.readUnsignedShort()
            goto L196
        L1a7:
            if (r25 == 0) goto L1bc
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r8 = r13.name
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r20] = r7
            r10[r17] = r8
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String.format(r7, r10)
            goto L1bd
        L1bc:
            r9 = 2
        L1bd:
            int r7 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r7 <= 0) goto L1df
            int r7 = r1.mLength
            long r7 = (long) r7
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L1df
            java.util.Set<java.lang.Integer> r7 = r0.mAttributesOffsets
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L1df
            r1.seek(r3)
            int r2 = r2.intValue()
            r0.readImageFileDirectory(r1, r2)
        L1df:
            r1.seek(r5)
            goto L259
        L1e4:
            r9 = 2
            int r2 = r1.peek()
            int r4 = r0.mOffsetToExifData
            int r2 = r2 + r4
            r11 = r27
            int r4 = (int) r11
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            r16 = r14
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r10 = (long) r2
            r19 = r4
            r17 = r10
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r31]
            java.lang.String r4 = r13.name
            r2.put(r4, r14)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r4 = r13.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L216
            r4 = 3
            r0.mMimeType = r4
        L216:
            java.lang.String r2 = "Make"
            java.lang.String r4 = r13.name
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L22a
            java.lang.String r2 = "Model"
            java.lang.String r4 = r13.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L238
        L22a:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            java.lang.String r2 = r14.getStringValue(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L24b
        L238:
            java.lang.String r2 = r13.name
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L24d
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            int r2 = r14.getIntValue(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L24d
        L24b:
            r0.mMimeType = r3
        L24d:
            int r2 = r1.peek()
            long r2 = (long) r2
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L259
            r1.seek(r5)
        L259:
            int r6 = r21 + 1
            short r6 = (short) r6
            r2 = r31
            r3 = r24
            r4 = 2
            goto L2d
        L263:
            r17 = 1
            r18 = 0
            r20 = 0
            int r2 = r1.peek()
            r4 = 4
            int r2 = r2 + r4
            int r3 = r1.mLength
            if (r2 > r3) goto L2bd
            int r2 = r1.readInt()
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L289
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r20] = r3
            java.lang.String r3 = "nextIfdOffset: %d"
            java.lang.String.format(r3, r5)
        L289:
            long r5 = (long) r2
            int r3 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r3 <= 0) goto L2bd
            int r3 = r1.mLength
            if (r2 >= r3) goto L2bd
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L2bd
            r1.seek(r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r4 = 4
            r2 = r2[r4]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2b0
            r0.readImageFileDirectory(r1, r4)
            return
        L2b0:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2bd
            r0.readImageFileDirectory(r1, r7)
        L2bd:
            return
    }

    private void removeAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            r1.remove(r3)
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    private void retrieveJpegImageSize(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "ImageLength"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "ImageWidth"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L55
        L1c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.nio.ByteOrder r1 = r4.mExifByteOrder
            int r1 = r0.getIntValue(r1)
            java.nio.ByteOrder r2 = r4.mExifByteOrder
            int r0 = r0.getIntValue(r2)
            long r2 = (long) r1
            r5.seek(r2)
            byte[] r0 = new byte[r0]
            r5.read(r0)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r0)
            r4.getJpegAttributes(r5, r1, r6)
        L55:
            return
    }

    private void saveJpegAttributes(java.io.InputStream r14, java.io.OutputStream r15) throws java.io.IOException {
            r13 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto La
            java.util.Objects.toString(r14)
            java.util.Objects.toString(r15)
        La:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r14)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r14 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r14.<init>(r15, r1)
            byte r15 = r0.readByte()
            java.lang.String r1 = "Invalid marker"
            r2 = -1
            if (r15 != r2) goto L10b
            r14.writeByte(r2)
            byte r15 = r0.readByte()
            r3 = -40
            if (r15 != r3) goto L105
            r14.writeByte(r3)
            java.lang.String r15 = "Xmp"
            java.lang.String r3 = r13.getAttribute(r15)
            r4 = 0
            if (r3 == 0) goto L45
            boolean r3 = r13.mXmpIsFromSeparateMarker
            if (r3 == 0) goto L45
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r13.mAttributes
            r3 = r3[r4]
            java.lang.Object r3 = r3.remove(r15)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            goto L46
        L45:
            r3 = 0
        L46:
            r14.writeByte(r2)
            r5 = -31
            r14.writeByte(r5)
            r13.writeExifSegment(r14)
            if (r3 == 0) goto L5a
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r13.mAttributes
            r6 = r6[r4]
            r6.put(r15, r3)
        L5a:
            r15 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r15]
        L5e:
            byte r6 = r0.readByte()
            if (r6 != r2) goto Lff
            byte r6 = r0.readByte()
            r7 = -39
            if (r6 == r7) goto Lf5
            r7 = -38
            if (r6 == r7) goto Lf5
            java.lang.String r7 = "Invalid length"
            if (r6 == r5) goto L9c
            r14.writeByte(r2)
            r14.writeByte(r6)
            int r6 = r0.readUnsignedShort()
            r14.writeUnsignedShort(r6)
            int r6 = r6 + (-2)
            if (r6 < 0) goto L96
        L85:
            if (r6 <= 0) goto L5e
            int r7 = java.lang.Math.min(r6, r15)
            int r7 = r0.read(r3, r4, r7)
            if (r7 < 0) goto L5e
            r14.write(r3, r4, r7)
            int r6 = r6 - r7
            goto L85
        L96:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r7)
            throw r14
        L9c:
            int r8 = r0.readUnsignedShort()
            int r9 = r8 + (-2)
            if (r9 < 0) goto Lef
            r10 = 6
            byte[] r11 = new byte[r10]
            if (r9 < r10) goto Lce
            int r12 = r0.read(r11)
            if (r12 != r10) goto Lc6
            byte[] r12 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r12 = java.util.Arrays.equals(r11, r12)
            if (r12 == 0) goto Lce
            int r8 = r8 + (-8)
            int r6 = r0.skipBytes(r8)
            if (r6 != r8) goto Lc0
            goto L5e
        Lc0:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r7)
            throw r14
        Lc6:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "Invalid exif"
            r14.<init>(r15)
            throw r14
        Lce:
            r14.writeByte(r2)
            r14.writeByte(r6)
            r14.writeUnsignedShort(r8)
            if (r9 < r10) goto Lde
            int r9 = r8 + (-8)
            r14.write(r11)
        Lde:
            if (r9 <= 0) goto L5e
            int r6 = java.lang.Math.min(r9, r15)
            int r6 = r0.read(r3, r4, r6)
            if (r6 < 0) goto L5e
            r14.write(r3, r4, r6)
            int r9 = r9 - r6
            goto Lde
        Lef:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r7)
            throw r14
        Lf5:
            r14.writeByte(r2)
            r14.writeByte(r6)
            copy(r0, r14)
            return
        Lff:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r1)
            throw r14
        L105:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r1)
            throw r14
        L10b:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r1)
            throw r14
    }

    private void savePngAttributes(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r5 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto La
            java.util.Objects.toString(r6)
            java.util.Objects.toString(r7)
        La:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r6)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r6 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r6.<init>(r7, r1)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r2 = r7.length
            copy(r0, r6, r2)
            int r2 = r5.mOffsetToExifData
            if (r2 != 0) goto L2d
            int r7 = r0.readInt()
            r6.writeInt(r7)
            int r7 = r7 + 8
            copy(r0, r6, r7)
            goto L3d
        L2d:
            int r7 = r7.length
            int r2 = r2 - r7
            int r2 = r2 + (-8)
            copy(r0, r6, r2)
            int r7 = r0.readInt()
            int r7 = r7 + 8
            r0.skipBytes(r7)
        L3d:
            r7 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream     // Catch: java.lang.Throwable -> L70
            r7.<init>(r2, r1)     // Catch: java.lang.Throwable -> L70
            r5.writeExifSegment(r7)     // Catch: java.lang.Throwable -> L70
            java.io.OutputStream r7 = r7.mOutputStream     // Catch: java.lang.Throwable -> L70
            java.io.ByteArrayOutputStream r7 = (java.io.ByteArrayOutputStream) r7     // Catch: java.lang.Throwable -> L70
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Throwable -> L70
            r6.write(r7)     // Catch: java.lang.Throwable -> L70
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            int r3 = r7.length     // Catch: java.lang.Throwable -> L70
            r4 = 4
            int r3 = r3 - r4
            r1.update(r7, r4, r3)     // Catch: java.lang.Throwable -> L70
            long r3 = r1.getValue()     // Catch: java.lang.Throwable -> L70
            int r7 = (int) r3     // Catch: java.lang.Throwable -> L70
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> L70
            closeQuietly(r2)
            copy(r0, r6)
            return
        L70:
            r6 = move-exception
            r7 = r2
            goto L74
        L73:
            r6 = move-exception
        L74:
            closeQuietly(r7)
            throw r6
    }

    private void saveWebpAttributes(java.io.InputStream r22, java.io.OutputStream r23) throws java.io.IOException {
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r2 == 0) goto Le
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r23)
        Le:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.<init>(r0, r3)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r4 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            r5 = r23
            r4.<init>(r5, r3)
            byte[] r5 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r6 = r5.length
            copy(r2, r4, r6)
            byte[] r6 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r7 = r6.length
            r8 = 4
            int r7 = r7 + r8
            r2.skipBytes(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1d4 java.lang.Exception -> L1d6
            r9.<init>()     // Catch: java.lang.Throwable -> L1d4 java.lang.Exception -> L1d6
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r10 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.<init>(r9, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r3 = r1.mOffsetToExifData     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r11 = 8
            if (r3 == 0) goto L5b
            int r0 = r5.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r0 = r0 + r8
            int r5 = r6.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r0 = r0 + r5
            int r3 = r3 - r0
            int r3 = r3 - r11
            copy(r2, r10, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r2.skipBytes(r8)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r0 = r2.readInt()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r2.skipBytes(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r1.writeExifSegment(r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            goto L1b4
        L53:
            r0 = move-exception
            r7 = r9
            goto L1df
        L57:
            r0 = move-exception
            r7 = r9
            goto L1d7
        L5b:
            byte[] r3 = new byte[r8]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r5 = r2.read(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r5 != r8) goto L1cc
            byte[] r5 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r6 = java.util.Arrays.equals(r3, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r12 = 0
            r13 = 1
            if (r6 == 0) goto Lbb
            int r3 = r2.readInt()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r6 = r3 % 2
            if (r6 != r13) goto L78
            int r6 = r3 + 1
            goto L79
        L78:
            r6 = r3
        L79:
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r2.read(r6)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r14 = r6[r12]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r11 = r11 | r14
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r6[r12] = r11     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r11 = r11 >> r13
            r11 = r11 & r13
            if (r11 != r13) goto L89
            r12 = 1
        L89:
            r10.write(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.writeInt(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.write(r6)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r12 == 0) goto Laf
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r1.copyChunksUpToGivenChunkType(r2, r10, r3, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L99:
            byte[] r3 = new byte[r8]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r0.read(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r5 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r5 = java.util.Arrays.equals(r3, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r5 != 0) goto Lab
            r1.writeExifSegment(r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            goto L1b4
        Lab:
            r1.copyWebPChunk(r2, r10, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            goto L99
        Laf:
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r1.copyChunksUpToGivenChunkType(r2, r10, r0, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r1.writeExifSegment(r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            goto L1b4
        Lbb:
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r6 = java.util.Arrays.equals(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r6 != 0) goto Lcb
            byte[] r6 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r6 = java.util.Arrays.equals(r3, r6)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r6 == 0) goto L1b4
        Lcb:
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r7 = r6 % 2
            if (r7 != r13) goto Ld6
            int r7 = r6 + 1
            goto Ld7
        Ld6:
            r7 = r6
        Ld7:
            r14 = 3
            byte[] r15 = new byte[r14]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r16 = java.util.Arrays.equals(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r23 = 4
            r8 = 47
            if (r16 == 0) goto L112
            r2.read(r15)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r13 = new byte[r14]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r16 = 8
            int r11 = r2.read(r13)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r11 != r14) goto L10a
            byte[] r11 = androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r11 = java.util.Arrays.equals(r11, r13)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r11 == 0) goto L10a
            int r11 = r2.readInt()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r13 = r11 << 18
            int r13 = r13 >> 18
            int r14 = r11 << 2
            int r14 = r14 >> 18
            int r7 = r7 + (-10)
        L107:
            r17 = 0
            goto L147
        L10a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.lang.String r2 = "Encountered error while checking VP8 signature"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            throw r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L112:
            r16 = 8
            byte[] r11 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r11 = java.util.Arrays.equals(r3, r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r11 == 0) goto L143
            byte r11 = r2.readByte()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r11 != r8) goto L13b
            int r11 = r2.readInt()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r14 = r11 << 18
            int r14 = r14 >> 18
            int r14 = r14 + r13
            int r17 = r11 << 4
            int r17 = r17 >> 18
            int r13 = r17 + 1
            r17 = r11 & 8
            int r7 = r7 + (-5)
            r20 = r14
            r14 = r13
            r13 = r20
            goto L147
        L13b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.lang.String r2 = "Encountered error while checking VP8L signature"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            throw r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L143:
            r11 = 0
            r13 = 0
            r14 = 0
            goto L107
        L147:
            r10.write(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5 = 10
            r10.writeInt(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r18 = r5[r12]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r19 = 0
            r12 = r18 | 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5[r19] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r17 = r17 << 4
            r12 = r12 | r17
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5[r19] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r13 = r13 + (-1)
            int r14 = r14 + (-1)
            byte r12 = (byte) r13     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5[r23] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r12 = r13 >> 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r17 = 5
            r5[r17] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r12 = r13 >> 16
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r13 = 6
            r5[r13] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r12 = 7
            byte r13 = (byte) r14     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5[r12] = r13     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r12 = r14 >> 8
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r5[r16] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r12 = r14 >> 16
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r13 = 9
            r5[r13] = r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.write(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.write(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.writeInt(r6)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r0 == 0) goto L1a0
            r10.write(r15)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.write(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.writeInt(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            goto L1ae
        L1a0:
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            if (r0 == 0) goto L1ae
            r10.write(r8)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r10.writeInt(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L1ae:
            copy(r2, r10, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r1.writeExifSegment(r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L1b4:
            copy(r2, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r3 = r2.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            int r0 = r0 + r3
            r4.writeInt(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r4.write(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            r9.writeTo(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            closeQuietly(r9)
            return
        L1cc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.lang.String r2 = "Encountered invalid length while parsing WebP chunk type"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            throw r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
        L1d4:
            r0 = move-exception
            goto L1df
        L1d6:
            r0 = move-exception
        L1d7:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1d4
            throw r2     // Catch: java.lang.Throwable -> L1d4
        L1df:
            closeQuietly(r7)
            throw r0
    }

    private void setThumbnailData(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            r2 = 6
            if (r1 == 0) goto L2f
            java.nio.ByteOrder r3 = r4.mExifByteOrder
            int r1 = r1.getIntValue(r3)
            r4.mThumbnailCompression = r1
            r3 = 1
            if (r1 == r3) goto L25
            if (r1 == r2) goto L21
            r2 = 7
            if (r1 == r2) goto L25
            goto L2e
        L21:
            r4.handleThumbnailFromJfif(r5, r0)
            return
        L25:
            boolean r1 = r4.isSupportedDataType(r0)
            if (r1 == 0) goto L2e
            r4.handleThumbnailFromStrips(r5, r0)
        L2e:
            return
        L2f:
            r4.mThumbnailCompression = r2
            r4.handleThumbnailFromJfif(r5, r0)
            return
    }

    private static boolean startsWith(byte[] r4, byte[] r5) {
            r0 = 0
            if (r4 == 0) goto L1b
            if (r5 != 0) goto L6
            goto L1b
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto Lc
        L19:
            r4 = 1
            return r4
        L1b:
            return r0
    }

    private void swapBasedOnImageSize(int r6, int r7) throws java.io.IOException {
            r5 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r5.mAttributes
            r0 = r0[r6]
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r5.mAttributes
            r0 = r0[r7]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L71
        L15:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r5.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "ImageLength"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r5.mAttributes
            r2 = r2[r6]
            java.lang.String r3 = "ImageWidth"
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r5.mAttributes
            r4 = r4[r7]
            java.lang.Object r1 = r4.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r5.mAttributes
            r4 = r4[r7]
            java.lang.Object r3 = r4.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L71
            if (r2 != 0) goto L46
            goto L71
        L46:
            if (r1 == 0) goto L71
            if (r3 != 0) goto L4b
            goto L71
        L4b:
            java.nio.ByteOrder r4 = r5.mExifByteOrder
            int r0 = r0.getIntValue(r4)
            java.nio.ByteOrder r4 = r5.mExifByteOrder
            int r2 = r2.getIntValue(r4)
            java.nio.ByteOrder r4 = r5.mExifByteOrder
            int r1 = r1.getIntValue(r4)
            java.nio.ByteOrder r4 = r5.mExifByteOrder
            int r3 = r3.getIntValue(r4)
            if (r0 >= r1) goto L71
            if (r2 >= r3) goto L71
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r5.mAttributes
            r1 = r0[r6]
            r2 = r0[r7]
            r0[r6] = r2
            r0[r7] = r1
        L71:
            return
    }

    private void updateImageSizeValues(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r8, int r9) throws java.io.IOException {
            r7 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r9]
            java.lang.String r1 = "DefaultCropSize"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            r1 = r1[r9]
            java.lang.String r2 = "SensorTopBorder"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r7.mAttributes
            r2 = r2[r9]
            java.lang.String r3 = "SensorLeftBorder"
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r3 = r3[r9]
            java.lang.String r4 = "SensorBottomBorder"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r7.mAttributes
            r4 = r4[r9]
            java.lang.String r5 = "SensorRightBorder"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r0 == 0) goto L9e
            int r8 = r0.format
            r1 = 5
            r2 = 1
            r3 = 0
            r4 = 2
            if (r8 != r1) goto L6d
            java.nio.ByteOrder r8 = r7.mExifByteOrder
            java.lang.Object r8 = r0.getValue(r8)
            androidx.exifinterface.media.ExifInterface$Rational[] r8 = (androidx.exifinterface.media.ExifInterface.Rational[]) r8
            if (r8 == 0) goto L69
            int r0 = r8.length
            if (r0 == r4) goto L58
            goto L69
        L58:
            r0 = r8[r3]
            java.nio.ByteOrder r1 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r0, r1)
            r8 = r8[r2]
            java.nio.ByteOrder r1 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r8, r1)
            goto L8b
        L69:
            java.util.Arrays.toString(r8)
            return
        L6d:
            java.nio.ByteOrder r8 = r7.mExifByteOrder
            java.lang.Object r8 = r0.getValue(r8)
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L9a
            int r0 = r8.length
            if (r0 == r4) goto L7b
            goto L9a
        L7b:
            r0 = r8[r3]
            java.nio.ByteOrder r1 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r1)
            r8 = r8[r2]
            java.nio.ByteOrder r1 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r1)
        L8b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            r1 = r1[r9]
            r1.put(r6, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r9 = r0[r9]
            r9.put(r5, r8)
            return
        L9a:
            java.util.Arrays.toString(r8)
            return
        L9e:
            if (r1 == 0) goto Ldf
            if (r2 == 0) goto Ldf
            if (r3 == 0) goto Ldf
            if (r4 == 0) goto Ldf
            java.nio.ByteOrder r8 = r7.mExifByteOrder
            int r8 = r1.getIntValue(r8)
            java.nio.ByteOrder r0 = r7.mExifByteOrder
            int r0 = r3.getIntValue(r0)
            java.nio.ByteOrder r1 = r7.mExifByteOrder
            int r1 = r4.getIntValue(r1)
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            if (r0 <= r8) goto Lde
            if (r1 <= r2) goto Lde
            int r0 = r0 - r8
            int r1 = r1 - r2
            java.nio.ByteOrder r8 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r8)
            java.nio.ByteOrder r0 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            r1 = r1[r9]
            r1.put(r5, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r7.mAttributes
            r8 = r8[r9]
            r8.put(r6, r0)
        Lde:
            return
        Ldf:
            r7.retrieveJpegImageSize(r8, r9)
            return
    }

    private void validateImages() throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 5
            r7.swapBasedOnImageSize(r0, r1)
            r2 = 4
            r7.swapBasedOnImageSize(r0, r2)
            r7.swapBasedOnImageSize(r1, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "PixelXDimension"
            java.lang.Object r3 = r3.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r4 = r5[r4]
            java.lang.String r5 = "PixelYDimension"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L3b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r5 = r5[r0]
            java.lang.String r6 = "ImageWidth"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r0 = r3[r0]
            java.lang.String r3 = "ImageLength"
            r0.put(r3, r4)
        L3b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r2]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r1]
            boolean r0 = r7.isThumbnail(r0)
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r3 = r0[r1]
            r0[r2] = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0[r1] = r3
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.mAttributes
            r0 = r0[r2]
            r7.isThumbnail(r0)
            return
    }

    private int writeExifSegment(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r20) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r3 = r2.length
            int[] r3 = new int[r3]
            int r2 = r2.length
            int[] r2 = new int[r2]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r4 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L11:
            if (r7 >= r5) goto L1d
            r8 = r4[r7]
            java.lang.String r8 = r8.name
            r0.removeAttribute(r8)
            int r7 = r7 + 1
            goto L11
        L1d:
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r4 = r4.name
            r0.removeAttribute(r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG
            java.lang.String r4 = r4.name
            r0.removeAttribute(r4)
            r4 = 0
        L2c:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r5 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r5 = r5.length
            if (r4 >= r5) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r4]
            java.util.Set r5 = r5.entrySet()
            java.lang.Object[] r5 = r5.toArray()
            int r7 = r5.length
            r8 = 0
        L3f:
            if (r8 >= r7) goto L59
            r9 = r5[r8]
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getValue()
            if (r10 != 0) goto L56
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r4]
            java.lang.Object r9 = r9.getKey()
            r10.remove(r9)
        L56:
            int r8 = r8 + 1
            goto L3f
        L59:
            int r4 = r4 + 1
            goto L2c
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r5 = 1
            r4 = r4[r5]
            boolean r4 = r4.isEmpty()
            r7 = 0
            if (r4 != 0) goto L7c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r9 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r9 = r9[r5]
            java.lang.String r9 = r9.name
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r10)
            r4.put(r9, r10)
        L7c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r9 = 2
            r4 = r4[r9]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r10 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r10 = r10[r9]
            java.lang.String r10 = r10.name
            java.nio.ByteOrder r11 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r11)
            r4.put(r10, r11)
        L9a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r10 = 3
            r4 = r4[r10]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Lb8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r5]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r11 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r11 = r11[r10]
            java.lang.String r11 = r11.name
            java.nio.ByteOrder r12 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r12)
            r4.put(r11, r12)
        Lb8:
            boolean r4 = r0.mHasThumbnail
            r11 = 4
            if (r4 == 0) goto Le2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r12 = r12.name
            java.nio.ByteOrder r13 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r13)
            r4.put(r12, r13)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_LENGTH_TAG
            java.lang.String r12 = r12.name
            int r13 = r0.mThumbnailLength
            long r13 = (long) r13
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r13, r15)
            r4.put(r12, r13)
        Le2:
            r4 = 0
        Le3:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r12 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r12 = r12.length
            if (r4 >= r12) goto L117
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r4]
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        Lf5:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L10f
            java.lang.Object r14 = r12.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r14
            int r14 = r14.size()
            if (r14 <= r11) goto Lf5
            int r13 = r13 + r14
            goto Lf5
        L10f:
            r12 = r2[r4]
            int r12 = r12 + r13
            r2[r4] = r12
            int r4 = r4 + 1
            goto Le3
        L117:
            r4 = 8
            r12 = 0
        L11a:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r13 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r13 = r13.length
            if (r12 >= r13) goto L13e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r13 = r0.mAttributes
            r13 = r13[r12]
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L13b
            r3[r12] = r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r13 = r0.mAttributes
            r13 = r13[r12]
            int r13 = r13.size()
            int r13 = r13 * 12
            int r13 = r13 + 6
            r14 = r2[r12]
            int r13 = r13 + r14
            int r4 = r4 + r13
        L13b:
            int r12 = r12 + 1
            goto L11a
        L13e:
            boolean r12 = r0.mHasThumbnail
            if (r12 == 0) goto L15c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = androidx.exifinterface.media.ExifInterface.JPEG_INTERCHANGE_FORMAT_TAG
            java.lang.String r13 = r13.name
            long r14 = (long) r4
            r16 = 2
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r9)
            r12.put(r13, r9)
            r0.mThumbnailOffset = r4
            int r9 = r0.mThumbnailLength
            int r4 = r4 + r9
            goto L15e
        L15c:
            r16 = 2
        L15e:
            int r9 = r0.mMimeType
            if (r9 != r11) goto L164
            int r4 = r4 + 8
        L164:
            boolean r9 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r9 == 0) goto L1a6
            r9 = 0
        L169:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r12 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r12 = r12.length
            if (r9 >= r12) goto L1a6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r13 = r3[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r14 = r0.mAttributes
            r14 = r14[r9]
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = r2[r9]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            r18 = 3
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r6] = r12
            r10[r5] = r13
            r10[r16] = r14
            r10[r18] = r15
            r10[r11] = r17
            java.lang.String r12 = "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"
            java.lang.String.format(r12, r10)
            int r9 = r9 + 1
            r10 = 3
            goto L169
        L1a6:
            r18 = 3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r5]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1c8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r9 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r9 = r9[r5]
            java.lang.String r9 = r9.name
            r10 = r3[r5]
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r10)
            r2.put(r9, r10)
        L1c8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r16]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1e8
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r9 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r9 = r9[r16]
            java.lang.String r9 = r9.name
            r10 = r3[r16]
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r10)
            r2.put(r9, r10)
        L1e8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r18]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L208
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r5]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r9 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r9 = r9[r18]
            java.lang.String r9 = r9.name
            r10 = r3[r18]
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r10)
            r2.put(r9, r10)
        L208:
            int r2 = r0.mMimeType
            r9 = 14
            if (r2 == r11) goto L227
            r10 = 13
            if (r2 == r10) goto L21e
            if (r2 == r9) goto L215
            goto L22f
        L215:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF
            r1.write(r2)
            r1.writeInt(r4)
            goto L22f
        L21e:
            r1.writeInt(r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF
            r1.write(r2)
            goto L22f
        L227:
            r1.writeUnsignedShort(r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            r1.write(r2)
        L22f:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            java.nio.ByteOrder r10 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r10) goto L238
            r2 = 19789(0x4d4d, float:2.773E-41)
            goto L23a
        L238:
            r2 = 18761(0x4949, float:2.629E-41)
        L23a:
            r1.writeShort(r2)
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            r2 = 42
            r1.writeUnsignedShort(r2)
            r12 = 8
            r1.writeUnsignedInt(r12)
            r2 = 0
        L24d:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r10 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r10 = r10.length
            if (r2 >= r10) goto L30f
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r2]
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L30b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r2]
            int r10 = r10.size()
            r1.writeUnsignedShort(r10)
            r10 = r3[r2]
            int r10 = r10 + 2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r2]
            int r12 = r12.size()
            int r12 = r12 * 12
            int r10 = r10 + r12
            int r10 = r10 + r11
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r12 = r12[r2]
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L283:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2cd
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r14 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r14 = r14[r2]
            java.lang.Object r15 = r13.getKey()
            java.lang.Object r14 = r14.get(r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r14 = (androidx.exifinterface.media.ExifInterface.ExifTag) r14
            int r14 = r14.number
            java.lang.Object r13 = r13.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r13
            int r15 = r13.size()
            r1.writeUnsignedShort(r14)
            int r14 = r13.format
            r1.writeUnsignedShort(r14)
            int r14 = r13.numberOfComponents
            r1.writeInt(r14)
            if (r15 <= r11) goto L2be
            long r13 = (long) r10
            r1.writeUnsignedInt(r13)
            int r10 = r10 + r15
            goto L283
        L2be:
            byte[] r13 = r13.bytes
            r1.write(r13)
            if (r15 >= r11) goto L283
        L2c5:
            if (r15 >= r11) goto L283
            r1.writeByte(r6)
            int r15 = r15 + 1
            goto L2c5
        L2cd:
            if (r2 != 0) goto L2e0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r11]
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L2e0
            r10 = r3[r11]
            long r12 = (long) r10
            r1.writeUnsignedInt(r12)
            goto L2e3
        L2e0:
            r1.writeUnsignedInt(r7)
        L2e3:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r2]
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L2ef:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L30b
            java.lang.Object r12 = r10.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r12 = r12.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r12
            byte[] r12 = r12.bytes
            int r13 = r12.length
            if (r13 <= r11) goto L2ef
            int r13 = r12.length
            r1.write(r12, r6, r13)
            goto L2ef
        L30b:
            int r2 = r2 + 1
            goto L24d
        L30f:
            boolean r2 = r0.mHasThumbnail
            if (r2 == 0) goto L31a
            byte[] r2 = r0.getThumbnailBytes()
            r1.write(r2)
        L31a:
            int r2 = r0.mMimeType
            if (r2 != r9) goto L325
            int r2 = r4 % 2
            if (r2 != r5) goto L325
            r1.writeByte(r6)
        L325:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r2)
            return r4
    }

    public void flipHorizontally() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L15;
                case 5: goto L13;
                case 6: goto L11;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 7
            goto L1a
        Le:
            r1 = 8
            goto L1a
        L11:
            r1 = 5
            goto L1a
        L13:
            r1 = 6
            goto L1a
        L15:
            r1 = 3
            goto L1a
        L17:
            r1 = 4
            goto L1a
        L19:
            r1 = 2
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public void flipVertically() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L17;
                case 3: goto L15;
                case 4: goto L1a;
                case 5: goto L12;
                case 6: goto L10;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 5
            goto L1a
        Le:
            r1 = 6
            goto L1a
        L10:
            r1 = 7
            goto L1a
        L12:
            r1 = 8
            goto L1a
        L15:
            r1 = 2
            goto L1a
        L17:
            r1 = 3
            goto L1a
        L19:
            r1 = 4
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public double getAltitude(double r8) {
            r7 = this;
            java.lang.String r0 = "GPSAltitude"
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r0 = r7.getAttributeDouble(r0, r1)
            java.lang.String r2 = "GPSAltitudeRef"
            r3 = -1
            int r2 = r7.getAttributeInt(r2, r3)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L20
            if (r2 < 0) goto L20
            r8 = 1
            if (r2 != r8) goto L1b
            goto L1c
        L1b:
            r3 = 1
        L1c:
            double r8 = (double) r3
            double r0 = r0 * r8
            return r0
        L20:
            return r8
    }

    @androidx.annotation.Nullable
    public java.lang.String getAttribute(@androidx.annotation.NonNull java.lang.String r10) {
            r9 = this;
            if (r10 == 0) goto L85
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = r9.getExifAttribute(r10)
            r1 = 0
            if (r0 == 0) goto L84
            java.util.HashSet<java.lang.String> r2 = androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility
            boolean r2 = r2.contains(r10)
            if (r2 != 0) goto L18
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.String r10 = r0.getStringValue(r10)
            return r10
        L18:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L79
            int r10 = r0.format
            r2 = 5
            if (r10 == r2) goto L2a
            r2 = 10
            if (r10 == r2) goto L2a
            return r1
        L2a:
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            androidx.exifinterface.media.ExifInterface$Rational[] r10 = (androidx.exifinterface.media.ExifInterface.Rational[]) r10
            if (r10 == 0) goto L75
            int r0 = r10.length
            r2 = 3
            if (r0 == r2) goto L39
            goto L75
        L39:
            r0 = 0
            r1 = r10[r0]
            long r3 = r1.numerator
            float r3 = (float) r3
            long r4 = r1.denominator
            float r1 = (float) r4
            float r3 = r3 / r1
            int r1 = (int) r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r4 = r10[r3]
            long r5 = r4.numerator
            float r5 = (float) r5
            long r6 = r4.denominator
            float r4 = (float) r6
            float r5 = r5 / r4
            int r4 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r10 = r10[r5]
            long r6 = r10.numerator
            float r6 = (float) r6
            long r7 = r10.denominator
            float r10 = (float) r7
            float r6 = r6 / r10
            int r10 = (int) r6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r2[r3] = r4
            r2[r5] = r10
            java.lang.String r10 = "%02d:%02d:%02d"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            return r10
        L75:
            java.util.Arrays.toString(r10)
            return r1
        L79:
            java.nio.ByteOrder r10 = r9.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L84
            double r2 = r0.getDoubleValue(r10)     // Catch: java.lang.NumberFormatException -> L84
            java.lang.String r10 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> L84
            return r10
        L84:
            return r1
        L85:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r10.<init>(r0)
            throw r10
    }

    @androidx.annotation.Nullable
    public byte[] getAttributeBytes(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 == 0) goto Lb
            byte[] r2 = r2.bytes
            return r2
        Lb:
            r2 = 0
            return r2
        Ld:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r2.<init>(r0)
            throw r2
    }

    public double getAttributeDouble(@androidx.annotation.NonNull java.lang.String r2, double r3) {
            r1 = this;
            if (r2 == 0) goto L11
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto L9
            goto L10
        L9:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L10
            double r2 = r2.getDoubleValue(r0)     // Catch: java.lang.NumberFormatException -> L10
            return r2
        L10:
            return r3
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "tag shouldn't be null"
            r2.<init>(r3)
            throw r2
    }

    public int getAttributeInt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L11
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto L9
            goto L10
        L9:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L10
            int r2 = r2.getIntValue(r0)     // Catch: java.lang.NumberFormatException -> L10
            return r2
        L10:
            return r3
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "tag shouldn't be null"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.Nullable
    public long[] getAttributeRange(@androidx.annotation.NonNull java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L26
            boolean r0 = r5.mModified
            if (r0 != 0) goto L1e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = r5.getExifAttribute(r6)
            if (r6 == 0) goto L1c
            long r0 = r6.bytesOffset
            byte[] r6 = r6.bytes
            int r6 = r6.length
            long r2 = (long) r6
            r6 = 2
            long[] r6 = new long[r6]
            r4 = 0
            r6[r4] = r0
            r0 = 1
            r6[r0] = r2
            return r6
        L1c:
            r6 = 0
            return r6
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "The underlying file has been modified since being parsed"
            r6.<init>(r0)
            throw r6
        L26:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r6.<init>(r0)
            throw r6
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTime() {
            r3 = this;
            java.lang.String r0 = "DateTime"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTime"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTime"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTimeDigitized() {
            r3 = this;
            java.lang.String r0 = "DateTimeDigitized"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeDigitized"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTimeDigitized"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTimeOriginal() {
            r3 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeOriginal"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTimeOriginal"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"AutoBoxing"})
    public java.lang.Long getGpsDateTime() {
            r5 = this;
            java.lang.String r0 = "GPSDateStamp"
            java.lang.String r0 = r5.getAttribute(r0)
            java.lang.String r1 = "GPSTimeStamp"
            java.lang.String r1 = r5.getAttribute(r1)
            r2 = 0
            if (r0 == 0) goto L5c
            if (r1 == 0) goto L5c
            java.util.regex.Pattern r3 = androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN
            java.util.regex.Matcher r4 = r3.matcher(r0)
            boolean r4 = r4.matches()
            if (r4 != 0) goto L28
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L28
            goto L5c
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 32
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r3 = 0
            r1.<init>(r3)
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary     // Catch: java.lang.IllegalArgumentException -> L5c
            java.util.Date r3 = r3.parse(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L5c
            if (r3 != 0) goto L53
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterSecondary     // Catch: java.lang.IllegalArgumentException -> L5c
            java.util.Date r3 = r3.parse(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L5c
            if (r3 != 0) goto L53
            return r2
        L53:
            long r0 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L5c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L5c
            return r0
        L5c:
            return r2
    }

    @java.lang.Deprecated
    public boolean getLatLong(float[] r5) {
            r4 = this;
            double[] r0 = r4.getLatLong()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r0[r1]
            float r2 = (float) r2
            r5[r1] = r2
            r1 = 1
            r2 = r0[r1]
            float r0 = (float) r2
            r5[r1] = r0
            return r1
    }

    @androidx.annotation.Nullable
    public double[] getLatLong() {
            r12 = this;
            java.lang.String r0 = "GPSLatitude"
            java.lang.String r0 = r12.getAttribute(r0)
            java.lang.String r1 = "GPSLatitudeRef"
            java.lang.String r1 = r12.getAttribute(r1)
            java.lang.String r2 = "GPSLongitude"
            java.lang.String r2 = r12.getAttribute(r2)
            java.lang.String r3 = "GPSLongitudeRef"
            java.lang.String r3 = r12.getAttribute(r3)
            if (r0 == 0) goto L43
            if (r1 == 0) goto L43
            if (r2 == 0) goto L43
            if (r3 == 0) goto L43
            r4 = 1
            r5 = 0
            r6 = 2
            double r7 = convertRationalLatLonToDouble(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L32
            double r9 = convertRationalLatLonToDouble(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L32
            double[] r11 = new double[r6]     // Catch: java.lang.IllegalArgumentException -> L32
            r11[r5] = r7     // Catch: java.lang.IllegalArgumentException -> L32
            r11[r4] = r9     // Catch: java.lang.IllegalArgumentException -> L32
            return r11
        L32:
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r0
            r7[r4] = r1
            r7[r6] = r2
            r0 = 3
            r7[r0] = r3
            java.lang.String r0 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.String.format(r0, r7)
        L43:
            r0 = 0
            return r0
    }

    public int getRotationDegrees() {
            r2 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r2.getAttributeInt(r0, r1)
            switch(r0) {
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lf;
                default: goto La;
            }
        La:
            r0 = 0
            return r0
        Lc:
            r0 = 90
            return r0
        Lf:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L12:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
    }

    @androidx.annotation.Nullable
    public byte[] getThumbnail() {
            r2 = this;
            int r0 = r2.mThumbnailCompression
            r1 = 6
            if (r0 == r1) goto Lb
            r1 = 7
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            byte[] r0 = r2.getThumbnailBytes()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Bitmap getThumbnailBitmap() {
            r8 = this;
            boolean r0 = r8.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.mThumbnailBytes
            if (r0 != 0) goto L10
            byte[] r0 = r8.getThumbnailBytes()
            r8.mThumbnailBytes = r0
        L10:
            int r0 = r8.mThumbnailCompression
            r2 = 6
            r3 = 0
            if (r0 == r2) goto L70
            r2 = 7
            if (r0 != r2) goto L1a
            goto L70
        L1a:
            r2 = 1
            if (r0 != r2) goto L6f
            byte[] r0 = r8.mThumbnailBytes
            int r0 = r0.length
            int r0 = r0 / 3
            int[] r2 = new int[r0]
        L24:
            if (r3 >= r0) goto L3f
            byte[] r4 = r8.mThumbnailBytes
            int r5 = r3 * 3
            r6 = r4[r5]
            int r6 = r6 << 16
            int r7 = r5 + 1
            r7 = r4[r7]
            int r7 = r7 << 8
            int r6 = r6 + r7
            int r5 = r5 + 2
            r4 = r4[r5]
            int r6 = r6 + r4
            r2[r3] = r6
            int r3 = r3 + 1
            goto L24
        L3f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.mAttributes
            r3 = 4
            r0 = r0[r3]
            java.lang.String r4 = "ImageLength"
            java.lang.Object r0 = r0.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r8.mAttributes
            r3 = r4[r3]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L6f
            if (r3 == 0) goto L6f
            java.nio.ByteOrder r1 = r8.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r8.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0, r3)
            return r0
        L6f:
            return r1
        L70:
            byte[] r0 = r8.mThumbnailBytes
            int r1 = r8.mThumbnailLength
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public byte[] getThumbnailBytes() {
            r10 = this;
            boolean r0 = r10.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r10.mThumbnailBytes
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r10.mAssetInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            if (r0 == 0) goto L29
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L25
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L54
        L1a:
            r2 = move-exception
            r9 = r1
            r1 = r0
            r0 = r2
            r2 = r9
            goto L9c
        L21:
            r2 = r1
            goto La5
        L25:
            closeQuietly(r0)
            return r1
        L29:
            java.lang.String r0 = r10.mFilename     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            if (r0 == 0) goto L3f
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            java.lang.String r2 = r10.mFilename     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            goto L18
        L35:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L9c
        L3a:
            r0 = r1
            r2 = r0
            goto La5
        L3f:
            java.io.FileDescriptor r0 = r10.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3a
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L98
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L98
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L98
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L98
            r9 = r2
            r2 = r0
            r0 = r9
        L54:
            int r3 = r10.mThumbnailOffset     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r4 = r10.mOffsetToExifData     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r5 = r10.mThumbnailOffset     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r6 = r10.mOffsetToExifData     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r5 = r5 + r6
            long r5 = (long) r5
            java.lang.String r7 = "Corrupted image"
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L8e
            int r3 = r10.mThumbnailLength     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r4 = r0.read(r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            int r5 = r10.mThumbnailLength     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            if (r4 != r5) goto L88
            r10.mThumbnailBytes = r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            closeQuietly(r0)
            if (r2 == 0) goto L80
            closeFileDescriptor(r2)
        L80:
            return r3
        L81:
            r1 = move-exception
            r9 = r1
            r1 = r0
        L84:
            r0 = r9
            goto L9c
        L86:
            goto La5
        L88:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            throw r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
        L8e:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
            throw r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L86
        L94:
            r2 = move-exception
            r9 = r2
            r2 = r0
            goto L84
        L98:
            r2 = r0
            r0 = r1
            goto La5
        L9c:
            closeQuietly(r1)
            if (r2 == 0) goto La4
            closeFileDescriptor(r2)
        La4:
            throw r0
        La5:
            closeQuietly(r0)
            if (r2 == 0) goto Lad
            closeFileDescriptor(r2)
        Lad:
            return r1
    }

    @androidx.annotation.Nullable
    public long[] getThumbnailRange() {
            r6 = this;
            boolean r0 = r6.mModified
            if (r0 != 0) goto L26
            boolean r0 = r6.mHasThumbnail
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r6.mHasThumbnailStrips
            if (r0 == 0) goto L12
            boolean r0 = r6.mAreThumbnailStripsConsecutive
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r6.mThumbnailOffset
            int r1 = r6.mOffsetToExifData
            int r0 = r0 + r1
            long r0 = (long) r0
            int r2 = r6.mThumbnailLength
            long r2 = (long) r2
            r4 = 2
            long[] r4 = new long[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            return r4
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The underlying file has been modified since being parsed"
            r0.<init>(r1)
            throw r0
    }

    public boolean hasAttribute(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r0.getExifAttribute(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean hasThumbnail() {
            r1 = this;
            boolean r0 = r1.mHasThumbnail
            return r0
    }

    public boolean isFlipped() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r3.getAttributeInt(r0, r1)
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 7
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r2) goto L15
            r2 = 5
            if (r0 == r2) goto L15
            r0 = 0
            return r0
        L15:
            return r1
    }

    public boolean isThumbnailCompressed() {
            r3 = this;
            boolean r0 = r3.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.mThumbnailCompression
            r2 = 6
            if (r0 == r2) goto L10
            r2 = 7
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            r0 = 1
            return r0
    }

    public void resetOrientation() {
            r2 = this;
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Orientation"
            r2.setAttribute(r1, r0)
            return
    }

    public void rotate(int r7) {
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L62
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.getAttributeInt(r1, r0)
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L28
            r4 = 4
        L28:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L5a
        L34:
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L5a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L4f
            r4 = 4
        L4f:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
        L5a:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.setAttribute(r1, r7)
            return
        L62:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
    }

    public void saveAttributes() throws java.io.IOException {
            r13 = this;
            boolean r0 = r13.isSupportedFormatForSavingAttributes()
            if (r0 == 0) goto L15b
            java.io.FileDescriptor r0 = r13.mSeekableFileDescriptor
            if (r0 != 0) goto L17
            java.lang.String r0 = r13.mFilename
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L17:
            r0 = 1
            r13.mModified = r0
            byte[] r1 = r13.getThumbnail()
            r13.mThumbnailBytes = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r3 = r13.mFilename     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r4 = 0
            if (r3 == 0) goto L3f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r6 = r13.mFilename     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto L4d
        L37:
            r0 = move-exception
            r6 = r1
            goto L154
        L3b:
            r0 = move-exception
            r6 = r1
            goto L14b
        L3f:
            java.io.FileDescriptor r3 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            int r6 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            android.system.Os.lseek(r3, r4, r6)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.io.FileDescriptor r6 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
        L4d:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L148
            copy(r3, r6)     // Catch: java.lang.Throwable -> L13f java.lang.Exception -> L142
            closeQuietly(r3)
            closeQuietly(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> Lcd
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> Lcd
            java.lang.String r7 = r13.mFilename     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            if (r7 == 0) goto L79
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            java.lang.String r8 = r13.mFilename     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            goto L87
        L6d:
            r0 = move-exception
            r9 = r1
            goto L133
        L71:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
        L75:
            r6 = r7
            r7 = r9
            goto Ld1
        L79:
            java.io.FileDescriptor r7 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            int r8 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            android.system.Os.lseek(r7, r4, r8)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            java.io.FileDescriptor r8 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
        L87:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> Lc7
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> Lc7
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            r9.<init>(r7)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            int r10 = r13.mMimeType     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r11 = 4
            if (r10 != r11) goto La3
            r13.saveJpegAttributes(r8, r9)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            goto Lb2
        L9a:
            r0 = move-exception
        L9b:
            r1 = r8
            goto L133
        L9e:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto Ld1
        La3:
            r11 = 13
            if (r10 != r11) goto Lab
            r13.savePngAttributes(r8, r9)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            goto Lb2
        Lab:
            r11 = 14
            if (r10 != r11) goto Lb2
            r13.saveWebpAttributes(r8, r9)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
        Lb2:
            closeQuietly(r8)
            closeQuietly(r9)
            r2.delete()
            r13.mThumbnailBytes = r1
            return
        Lbe:
            r0 = move-exception
            r9 = r1
            goto L9b
        Lc1:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto Ld1
        Lc7:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto Ld1
        Lcd:
            r7 = move-exception
            r8 = r1
            r9 = r8
            goto L75
        Ld1:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10a
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L108 java.lang.Exception -> L10a
            java.lang.String r1 = r13.mFilename     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            if (r1 != 0) goto Lef
            java.io.FileDescriptor r1 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            int r11 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            android.system.Os.lseek(r1, r4, r11)     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            java.io.FileDescriptor r4 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
        Le8:
            r7 = r1
            goto Lf7
        Lea:
            r0 = move-exception
            r1 = r10
            goto L12c
        Led:
            r1 = move-exception
            goto L10d
        Lef:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            java.lang.String r4 = r13.mFilename     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            goto Le8
        Lf7:
            copy(r10, r7)     // Catch: java.lang.Throwable -> Lea java.lang.Exception -> Led
            closeQuietly(r10)     // Catch: java.lang.Throwable -> L9a
            closeQuietly(r7)     // Catch: java.lang.Throwable -> L9a
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L108:
            r0 = move-exception
            goto L12c
        L10a:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L10d:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L128
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L128
            r4.<init>()     // Catch: java.lang.Throwable -> L128
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch: java.lang.Throwable -> L128
            java.lang.String r5 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L128
            r4.append(r5)     // Catch: java.lang.Throwable -> L128
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L128
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L128
            throw r3     // Catch: java.lang.Throwable -> L128
        L128:
            r1 = move-exception
            r0 = r1
            r1 = r10
            r3 = 1
        L12c:
            closeQuietly(r1)     // Catch: java.lang.Throwable -> L9a
            closeQuietly(r7)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L133:
            closeQuietly(r1)
            closeQuietly(r9)
            if (r3 != 0) goto L13e
            r2.delete()
        L13e:
            throw r0
        L13f:
            r0 = move-exception
        L140:
            r1 = r3
            goto L154
        L142:
            r0 = move-exception
        L143:
            r1 = r3
            goto L14b
        L145:
            r0 = move-exception
            r6 = r1
            goto L140
        L148:
            r0 = move-exception
            r6 = r1
            goto L143
        L14b:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L153
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L153
            throw r2     // Catch: java.lang.Throwable -> L153
        L153:
            r0 = move-exception
        L154:
            closeQuietly(r1)
            closeQuietly(r6)
            throw r0
        L15b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
            r0.<init>(r1)
            throw r0
    }

    public void setAltitude(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            java.lang.String r0 = "0"
            goto Lb
        L9:
            java.lang.String r0 = "1"
        Lb:
            androidx.exifinterface.media.ExifInterface$Rational r1 = new androidx.exifinterface.media.ExifInterface$Rational
            double r4 = java.lang.Math.abs(r4)
            r1.<init>(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "GPSAltitude"
            r3.setAttribute(r5, r4)
            java.lang.String r4 = "GPSAltitudeRef"
            r3.setAttribute(r4, r0)
            return
    }

    public void setAttribute(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.Nullable java.lang.String r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            if (r1 == 0) goto L2bb
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L20
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L20
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L4f
        L20:
            if (r2 == 0) goto L4f
            java.util.regex.Pattern r3 = androidx.exifinterface.media.ExifInterface.DATETIME_PRIMARY_FORMAT_PATTERN
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r4 = androidx.exifinterface.media.ExifInterface.DATETIME_SECONDARY_FORMAT_PATTERN
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r4 = r4.find()
            int r5 = r2.length()
            r6 = 19
            if (r5 != r6) goto L4e
            if (r3 != 0) goto L43
            if (r4 != 0) goto L43
            goto L4e
        L43:
            if (r4 == 0) goto L4f
            java.lang.String r3 = "-"
            java.lang.String r4 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r4)
            goto L4f
        L4e:
            return
        L4f:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L59
            java.lang.String r1 = "PhotographicSensitivity"
        L59:
            r3 = 2
            r4 = 1
            if (r2 == 0) goto Lc2
            java.util.HashSet<java.lang.String> r5 = androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto Lc2
            java.lang.String r5 = "GPSTimeStamp"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto Lb3
            java.util.regex.Pattern r5 = androidx.exifinterface.media.ExifInterface.GPS_TIMESTAMP_PATTERN
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.find()
            if (r5 != 0) goto L7a
            return
        L7a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.group(r4)
            int r6 = java.lang.Integer.parseInt(r6)
            r5.append(r6)
            java.lang.String r6 = "/1,"
            r5.append(r6)
            java.lang.String r7 = r2.group(r3)
            int r7 = java.lang.Integer.parseInt(r7)
            r5.append(r7)
            r5.append(r6)
            r6 = 3
            java.lang.String r2 = r2.group(r6)
            int r2 = java.lang.Integer.parseInt(r2)
            r5.append(r2)
            java.lang.String r2 = "/1"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto Lc2
        Lb3:
            double r5 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> Lc1
            androidx.exifinterface.media.ExifInterface$Rational r2 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.NumberFormatException -> Lc1
            r2.<init>(r5)     // Catch: java.lang.NumberFormatException -> Lc1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Lc1
            goto Lc2
        Lc1:
            return
        Lc2:
            r5 = 0
            r6 = 0
        Lc4:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r7 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r7 = r7.length
            if (r6 >= r7) goto L2ba
            r7 = 4
            if (r6 != r7) goto Ld4
            boolean r7 = r0.mHasThumbnail
            if (r7 != 0) goto Ld4
        Ld0:
            r18 = 1
            goto L2b4
        Ld4:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r7 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r7 = r7[r6]
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r7 = (androidx.exifinterface.media.ExifInterface.ExifTag) r7
            if (r7 == 0) goto Ld0
            if (r2 != 0) goto Lea
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r6]
            r7.remove(r1)
            goto Ld0
        Lea:
            android.util.Pair r8 = guessDataFormat(r2)
            int r9 = r7.primaryFormat
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            if (r9 == r10) goto L17f
            int r9 = r7.primaryFormat
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L109
            goto L17f
        L109:
            int r9 = r7.secondaryFormat
            if (r9 == r11) goto L126
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 == r10) goto L123
            int r9 = r7.secondaryFormat
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L126
        L123:
            int r7 = r7.secondaryFormat
            goto L181
        L126:
            int r9 = r7.primaryFormat
            if (r9 == r4) goto L17d
            r10 = 7
            if (r9 == r10) goto L17d
            if (r9 != r3) goto L130
            goto L17d
        L130:
            boolean r9 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r9 == 0) goto Ld0
            java.lang.String[] r9 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            int r10 = r7.primaryFormat
            r10 = r9[r10]
            int r10 = r7.secondaryFormat
            java.lang.String r12 = ", "
            if (r10 != r11) goto L141
            goto L150
        L141:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            int r7 = r7.secondaryFormat
            r7 = r9[r7]
            r10.append(r7)
        L150:
            java.lang.Object r7 = r8.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r9[r7]
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L166
            goto Ld0
        L166:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r9[r8]
            r7.append(r8)
            goto Ld0
        L17d:
            r7 = r9
            goto L181
        L17f:
            int r7 = r7.primaryFormat
        L181:
            java.lang.String r8 = "/"
            java.lang.String r9 = ","
            switch(r7) {
                case 1: goto L2a7;
                case 2: goto L299;
                case 3: goto L273;
                case 4: goto L24d;
                case 5: goto L214;
                case 6: goto L188;
                case 7: goto L299;
                case 8: goto L188;
                case 9: goto L1ed;
                case 10: goto L1af;
                case 11: goto L188;
                case 12: goto L18a;
                default: goto L188;
            }
        L188:
            goto Ld0
        L18a:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r8 = r7.length
            double[] r8 = new double[r8]
            r9 = 0
        L192:
            int r10 = r7.length
            if (r9 >= r10) goto L1a0
            r10 = r7[r9]
            double r10 = java.lang.Double.parseDouble(r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L192
        L1a0:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r6]
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createDouble(r8, r9)
            r7.put(r1, r8)
            goto Ld0
        L1af:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r9 = r7.length
            androidx.exifinterface.media.ExifInterface$Rational[] r9 = new androidx.exifinterface.media.ExifInterface.Rational[r9]
            r10 = 0
        L1b7:
            int r12 = r7.length
            if (r10 >= r12) goto L1dc
            r12 = r7[r10]
            java.lang.String[] r12 = r12.split(r8, r11)
            androidx.exifinterface.media.ExifInterface$Rational r13 = new androidx.exifinterface.media.ExifInterface$Rational
            r14 = r12[r5]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r12 = r12[r4]
            r18 = 1
            double r3 = java.lang.Double.parseDouble(r12)
            long r3 = (long) r3
            r13.<init>(r14, r3)
            r9[r10] = r13
            int r10 = r10 + 1
            r3 = 2
            r4 = 1
            goto L1b7
        L1dc:
            r18 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSRational(r9, r4)
            r3.put(r1, r4)
            goto L2b4
        L1ed:
            r18 = 1
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L1f7:
            int r8 = r3.length
            if (r7 >= r8) goto L205
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L1f7
        L205:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSLong(r4, r7)
            r3.put(r1, r4)
            goto L2b4
        L214:
            r18 = 1
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            androidx.exifinterface.media.ExifInterface$Rational[] r4 = new androidx.exifinterface.media.ExifInterface.Rational[r4]
            r7 = 0
        L21e:
            int r9 = r3.length
            if (r7 >= r9) goto L23f
            r9 = r3[r7]
            java.lang.String[] r9 = r9.split(r8, r11)
            androidx.exifinterface.media.ExifInterface$Rational r10 = new androidx.exifinterface.media.ExifInterface$Rational
            r12 = r9[r5]
            double r12 = java.lang.Double.parseDouble(r12)
            long r12 = (long) r12
            r9 = r9[r18]
            double r14 = java.lang.Double.parseDouble(r9)
            long r14 = (long) r14
            r10.<init>(r12, r14)
            r4[r7] = r10
            int r7 = r7 + 1
            goto L21e
        L23f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r4, r7)
            r3.put(r1, r4)
            goto L2b4
        L24d:
            r18 = 1
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r7 = 0
        L257:
            int r8 = r3.length
            if (r7 >= r8) goto L265
            r8 = r3[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L257
        L265:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r4, r7)
            r3.put(r1, r4)
            goto L2b4
        L273:
            r18 = 1
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L27d:
            int r8 = r3.length
            if (r7 >= r8) goto L28b
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L27d
        L28b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r7)
            r3.put(r1, r4)
            goto L2b4
        L299:
            r18 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r2)
            r3.put(r1, r4)
            goto L2b4
        L2a7:
            r18 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(r2)
            r3.put(r1, r4)
        L2b4:
            int r6 = r6 + 1
            r3 = 2
            r4 = 1
            goto Lc4
        L2ba:
            return
        L2bb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setDateTime(@androidx.annotation.NonNull java.lang.Long r7) {
            r6 = this;
            long r0 = r7.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 % r2
            java.text.SimpleDateFormat r2 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary
            java.util.Date r3 = new java.util.Date
            long r4 = r7.longValue()
            r3.<init>(r4)
            java.lang.String r7 = r2.format(r3)
            java.lang.String r2 = "DateTime"
            r6.setAttribute(r2, r7)
            java.lang.String r7 = "SubSecTime"
            java.lang.String r0 = java.lang.Long.toString(r0)
            r6.setAttribute(r7, r0)
            return
    }

    public void setGpsInfo(android.location.Location r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "GPSProcessingMethod"
            java.lang.String r1 = r6.getProvider()
            r5.setAttribute(r0, r1)
            double r0 = r6.getLatitude()
            double r2 = r6.getLongitude()
            r5.setLatLong(r0, r2)
            double r0 = r6.getAltitude()
            r5.setAltitude(r0)
            java.lang.String r0 = "GPSSpeedRef"
            java.lang.String r1 = "K"
            r5.setAttribute(r0, r1)
            androidx.exifinterface.media.ExifInterface$Rational r0 = new androidx.exifinterface.media.ExifInterface$Rational
            float r1 = r6.getSpeed()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r3 = 1
            long r2 = r2.toSeconds(r3)
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            double r1 = (double) r1
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GPSSpeed"
            r5.setAttribute(r1, r0)
            java.text.SimpleDateFormat r0 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary
            java.util.Date r1 = new java.util.Date
            long r2 = r6.getTime()
            r1.<init>(r2)
            java.lang.String r6 = r0.format(r1)
            java.lang.String r0 = "\\s+"
            r1 = -1
            java.lang.String[] r6 = r6.split(r0, r1)
            r0 = 0
            r0 = r6[r0]
            java.lang.String r1 = "GPSDateStamp"
            r5.setAttribute(r1, r0)
            r0 = 1
            r6 = r6[r0]
            java.lang.String r0 = "GPSTimeStamp"
            r5.setAttribute(r0, r6)
            return
    }

    public void setLatLong(double r5, double r7) {
            r4 = this;
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            java.lang.String r2 = " is not valid."
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L85
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L85
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L85
            r0 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto L6b
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 > 0) goto L6b
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto L6b
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L3b
            java.lang.String r2 = "N"
            goto L3d
        L3b:
            java.lang.String r2 = "S"
        L3d:
            java.lang.String r3 = "GPSLatitudeRef"
            r4.setAttribute(r3, r2)
            double r5 = java.lang.Math.abs(r5)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLatitude"
            r4.setAttribute(r6, r5)
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L56
            java.lang.String r5 = "E"
            goto L58
        L56:
            java.lang.String r5 = "W"
        L58:
            java.lang.String r6 = "GPSLongitudeRef"
            r4.setAttribute(r6, r5)
            double r5 = java.lang.Math.abs(r7)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLongitude"
            r4.setAttribute(r6, r5)
            return
        L6b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Longitude value "
            r6.append(r0)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Latitude value "
            r8.append(r0)
            r8.append(r5)
            r8.append(r2)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
    }
}

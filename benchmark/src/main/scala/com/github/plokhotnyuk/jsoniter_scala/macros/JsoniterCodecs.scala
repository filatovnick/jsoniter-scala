package com.github.plokhotnyuk.jsoniter_scala.macros

import com.github.plokhotnyuk.jsoniter_scala.core.{JsonCodec, ReaderConfig}
import com.github.plokhotnyuk.jsoniter_scala.macros.JsonCodecMaker.make

object JsoniterCodecs {
  val stacklessExceptionConfig = ReaderConfig(throwParseExceptionWithStackTrace = false)
  val stacklessExceptionWithoutDumpConfig = ReaderConfig(throwParseExceptionWithStackTrace = false, appendHexDumpToParseException = false)
  val preallocatedBuf: ThreadLocal[Array[Byte]] = new ThreadLocal[Array[Byte]] {
    override def initialValue(): Array[Byte] = new Array(100000)
  }
  val anyRefsCodec: JsonCodec[AnyRefs] = make[AnyRefs](CodecMakerConfig())
  val arraysCodec: JsonCodec[Arrays] = make[Arrays](CodecMakerConfig())
  val bitSetsCodec: JsonCodec[BitSets] = make[BitSets](CodecMakerConfig())
  val iterablesCodec: JsonCodec[Iterables] = make[Iterables](CodecMakerConfig())
  val mapsCodec: JsonCodec[Maps] = make[Maps](CodecMakerConfig())
  val missingReqFieldCodec: JsonCodec[MissingReqFields] = make[MissingReqFields](CodecMakerConfig())
  val mutableIterablesCodec: JsonCodec[MutableIterables] = make[MutableIterables](CodecMakerConfig())
  val mutableMapsCodec: JsonCodec[MutableMaps] = make[MutableMaps](CodecMakerConfig())
  val intAndLongMapsCodec: JsonCodec[IntAndLongMaps] = make[IntAndLongMaps](CodecMakerConfig())
  val primitivesCodec: JsonCodec[Primitives] = make[Primitives](CodecMakerConfig())
  val extractFieldsCodec: JsonCodec[ExtractFields] = make[ExtractFields](CodecMakerConfig())
  val adtCodec: JsonCodec[AdtBase] = make[AdtBase](CodecMakerConfig())
  val stringCodec: JsonCodec[String] = make[String](CodecMakerConfig())
  val googleMapsAPICodec: JsonCodec[DistanceMatrix] = make[DistanceMatrix](CodecMakerConfig())
  val twitterAPICodec: JsonCodec[Seq[Tweet]] = make[Seq[Tweet]](CodecMakerConfig())
}

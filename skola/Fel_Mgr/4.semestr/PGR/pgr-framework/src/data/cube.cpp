// GENERATED FILE - DO NOT EDIT
#include "MeshData.h"
namespace pgr {
const float cubeVertices[] = {
  1, -1, -1, 0, -1, 0, 0, 0,
  1, -1, 1, 0, -1, 0, 1, 0,
  -1, -1, 1, 0, -1, 0, 1, 1,
  -1, -1, -1, 0, -1, 0, 0, 1,
  1, 1, -1, 0, 1, 0, 0, 0,
  -1, 1, -1, 0, 1, 0, 1, 0,
  -1, 1, 1, 0, 1, 0, 1, 1,
  1, 1, 1, 0, 1, 0, 0, 1,
  1, -1, -1, 1, 0, 0, 1, 0,
  1, 1, -1, 1, 0, 0, 1, 1,
  1, 1, 1, 1, 0, 0, 0, 1,
  1, -1, 1, 1, 0, 0, 0, 0,
  1, -1, 1, -0, -0, 1, 1, 0,
  1, 1, 1, -0, -0, 1, 1, 1,
  -1, 1, 1, -0, -0, 1, 0, 1,
  -1, -1, 1, -0, -0, 1, 0, 0,
  -1, -1, 1, -1, -0, -0, 1, 0,
  -1, 1, 1, -1, -0, -0, 1, 1,
  -1, 1, -1, -1, -0, -0, 0, 1,
  -1, -1, -1, -1, -0, -0, 0, 0,
  1, 1, -1, 0, 0, -1, 0, 1,
  1, -1, -1, 0, 0, -1, 0, 0,
  -1, -1, -1, 0, 0, -1, 1, 0,
  -1, 1, -1, 0, 0, -1, 1, 1,
};

const unsigned cubeTriangles[] = {
  0, 1, 2,
  0, 2, 3,
  4, 5, 6,
  4, 6, 7,
  8, 9, 10,
  8, 10, 11,
  12, 13, 14,
  12, 14, 15,
  16, 17, 18,
  16, 18, 19,
  20, 21, 22,
  20, 22, 23,
};

const struct MeshData cubeData = {
  24,
  12,
  8,
  cubeVertices,
  cubeTriangles,
};
} // end namespace pgr
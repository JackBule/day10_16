import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:day10_16/day10_16.dart';

void main() {
  const MethodChannel channel = MethodChannel('day10_16');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await Day1016.platformVersion, '42');
  });
}

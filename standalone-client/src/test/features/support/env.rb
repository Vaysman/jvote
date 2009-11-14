#!/usr/bin/ruby

require "java"
require "D:/WORK/univer/voting/swinger/lib/swinger"
#TODO need to change to ${smthg} for filtering
require "C:/Documents and Settings/vaysman/.m2/repository/org/jdesktop/appframework/1.0.3/appframework-1.0.3.jar"
require "D:/WORK/univer/voting/jvote/standalone-client/target/standalone-client-1.0-SNAPSHOT.jar"
import "ru.wiseman.jvote.client.VoteClient"

at_exit do
  java.lang.System.exit(0)
end
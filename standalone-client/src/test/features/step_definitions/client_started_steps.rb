#!/usr/bin/ruby

Given /^Client not started$/ do
end

When /^I start the client$/ do
  VoteClient.main([""].to_java(:string))
end
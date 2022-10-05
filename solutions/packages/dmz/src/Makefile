all: fxs pylint
.PHONY: all

# Include standard NCS examples build definitions and rules
include $(NCS_DIR)/src/ncs/build/include.ncs.mk

SRC = $(wildcard yang/*.yang)
DIRS = ../load-dir java/src/$(JDIR)/$(NS)
FXS = $(SRC:yang/%.yang=../load-dir/%.fxs)

NCSCPATH   = $(YANGPATH:%=--yangpath %)
YANGERPATH = $(YANGPATH:%=--path %)
YANGPATH += ../../router/src/yang
YANGPATH += ../../firewall/src/yang

PYLINT = pylint
PYLINTFLAGS = --disable=R,C --reports=n
PYDIR = ../python/dmz
PYTHONFILES = $(wildcard $(PYDIR)/*.py)

pylint: $(patsubst %.py, %.pylint, $(PYTHONFILES))

%.pylint:
	$(PYLINT) $(PYLINTFLAGS) $*.py  || (test $$? -ge 4)

fxs: $(DIRS) $(FXS)

$(DIRS):
	mkdir -p $@

../load-dir/%.fxs: yang/%.yang
	$(NCSC)  `ls $*-ann.yang  > /dev/null 2>&1 && echo "-a $*-ann.yang"` \
             $(NCSCPATH) -c -o $@ $<

clean:
	rm -rf $(DIRS)
.PHONY: clean
